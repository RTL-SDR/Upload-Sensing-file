package org.tudelft.power.pt4;

import java.io.IOException;
import java.io.InputStream;

public class Sample
{
	
	private final static byte buf[] = new byte[2];
	
	private final static int coarseTick = 250;
	
	// We assume hardware rev. C or later
	private final static double voltageTick = 125 / 1000.0 / 1000.0;
	
	private final int main, usb, aux;
	private final int voltageAndMarkers;
	private final long time;

	private Sample(long time, int main, int usb, int aux, int voltageAndMarkers)
	{
		this.time = time;
		this.main = main;
		this.usb = usb;
		this.aux = aux;
		this.voltageAndMarkers = voltageAndMarkers;
	}
	
	public int getMain()
	{
		return main;
	}

	public double getMainMilliAmps()
	{
		return main/1000.0;
	}
	
	public int getAux()
	{
		return aux;
	}
	
	public double getAuxMilliAmps()
	{
		return aux/1000.0;
	}
	
	public int getUsb()
	{
		return usb;
	}
	
	public double getUsbMilliAmps()
	{
		return usb/1000.0;
	}
	
	public int getMarker0()
	{
		return voltageAndMarkers & 1;
	}
	
	public int getMarker1()
	{
		return (voltageAndMarkers >> 1) & 1;
	}
	
	public double getVoltage()
	{
		return (voltageAndMarkers & ~3) * voltageTick;
	}
	
	public int getVoltageAndMarkers()
	{
		return voltageAndMarkers;
	}
	
	public boolean isMissing()
	{
		return voltageAndMarkers == 0xFFFF;
	}
	
	public long getTime()
	{
		return time;
	}
	
	public static Sample read(int sampleNr, InputStream stream, Header header) throws IOException
	{
		int main = 0, usb = 0, aux = 0, voltageAndMarkers = 0;
		
		if (header.hasMainChannel())
			main = readShort(stream);
		
		if (header.hasUsbChannel())
			usb = readShort(stream);
		
		if (header.hasAuxChannel())
			aux = readShort(stream);
		
		// Main or Aux voltage, markers
		voltageAndMarkers = readShort(stream) & 0xffff;
		
		return new Sample(
				(long)(sampleNr * (1000*1000/header.getSoftwareRate())),
				convertTicks(main),
				convertTicks(usb),
				convertTicks(aux),
				voltageAndMarkers);
	}
	
	private static int convertTicks(int value)
	{
		if ((value&1)==1)
			return (value&~1) * coarseTick;
		else
			return value;
	}
	
	private static short readShort(InputStream stream) throws IOException
	{
		stream.read(buf);
		return (short)((buf[0]&0xff) + ((buf[1]&0xff)<<8));
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%f, %f, %f, %f, %f, %d, %d", time/1000.0/1000.0, main/1000.0, usb/1000.0, aux/1000.0, getVoltage(), getMarker0(), getMarker1());
	}

}
