package org.tudelft.power.pt4;

import org.codehaus.preon.annotation.BoundNumber;

public class Status
{
	
	public final static int Size = 60;
	
	@BoundNumber(size = "8")
	private int packetLength;

	@BoundNumber(size = "8")
	private int packetType;

	@BoundNumber(size = "8")
	private int firmwareVersion;

	@BoundNumber(size = "8")
	private int protocolVersion;

	@BoundNumber(size = "16")
	private int mainFineCurrent;

	@BoundNumber(size = "16")
	private int usbFineCurrent;

	@BoundNumber(size = "16")
	private int auxFineCurrent;

	@BoundNumber(size = "16")
	private int voltage1;

	@BoundNumber(size = "16")
	private int mainCoarseCurrent;

	@BoundNumber(size = "16")
	private int usbCoarseCurrent;

	@BoundNumber(size = "16")
	private int auxCoarseCurrent;

	@BoundNumber(size = "16")
	private int voltage2;

	@BoundNumber(size = "8")
	private int outputVoltageSetting;

	@BoundNumber(size = "8")
	private int temperature;

	@BoundNumber(size = "8")
	private int status;

	@BoundNumber(size = "8")
	private int reserved;

	@BoundNumber(size = "8")
	private int leds;

	@BoundNumber(size = "8")
	private int mainFineResistor;

	@BoundNumber(size = "16")
	private int serialNumber;

	@BoundNumber(size = "8")
	private int sampleRate;

	@BoundNumber(size = "16")
	private int dacCalLow;

	@BoundNumber(size = "16")
	private int dacCalHigh;

	@BoundNumber(size = "16")
	private int powerUpCurrentLimit;

	@BoundNumber(size = "16")
	private int runTimeCurrentLimit;

	@BoundNumber(size = "8")
	private int powerUpTime;

	@BoundNumber(size = "8")
	private int usbFineResitor;

	@BoundNumber(size = "8")
	private int auxFineResistor;

	@BoundNumber(size = "16")
	private int initialUsbVoltage;

	@BoundNumber(size = "16")
	private int initialAuxVoltage;

	@BoundNumber(size = "8")
	private int hardwareRevision;

	@BoundNumber(size = "8")
	private int temperatureLimit;

	@BoundNumber(size = "8")
	private int usbPassthroughMode;

	@BoundNumber(size = "8")
	private int mainCoarseResistor;

	@BoundNumber(size = "8")
	private int usbCoarseResistor;

	@BoundNumber(size = "8")
	private int auxCoarseResistor;

	@BoundNumber(size = "8")
	private int defMainFineResistor;

	@BoundNumber(size = "8")
	private int defUsbFineResistor;

	@BoundNumber(size = "8")
	private int defAuxFineResistor;

	@BoundNumber(size = "8")
	private int defMainCoarseResistor;

	@BoundNumber(size = "8")
	private int defUsbCoarseResistor;

	@BoundNumber(size = "8")
	private int defAuxCoarseResistor;

	@BoundNumber(size = "8")
	private int eventCode;

	@BoundNumber(size = "16")
	private int eventData;

	@BoundNumber(size = "8")
	private int checkSum;

	public static int getSize()
	{
		return Size;
	}

	public int getPacketLength()
	{
		return packetLength;
	}

	public int getPacketType()
	{
		return packetType;
	}

	public int getFirmwareVersion()
	{
		return firmwareVersion;
	}

	public int getProtocolVersion()
	{
		return protocolVersion;
	}

	public int getMainFineCurrent()
	{
		return mainFineCurrent;
	}

	public int getUsbFineCurrent()
	{
		return usbFineCurrent;
	}

	public int getAuxFineCurrent()
	{
		return auxFineCurrent;
	}

	public int getVoltage1()
	{
		return voltage1;
	}

	public int getMainCoarseCurrent()
	{
		return mainCoarseCurrent;
	}

	public int getUsbCoarseCurrent()
	{
		return usbCoarseCurrent;
	}

	public int getAuxCoarseCurrent()
	{
		return auxCoarseCurrent;
	}

	public int getVoltage2()
	{
		return voltage2;
	}

	public int getOutputVoltageSetting()
	{
		return outputVoltageSetting;
	}

	public int getTemperature()
	{
		return temperature;
	}

	public int getStatus()
	{
		return status;
	}

	public int getReserved()
	{
		return reserved;
	}

	public int getLeds()
	{
		return leds;
	}

	public int getMainFineResistor()
	{
		return mainFineResistor;
	}

	public int getSerialNumber()
	{
		return serialNumber;
	}

	public int getSampleRate()
	{
		return sampleRate;
	}

	public int getDacCalLow()
	{
		return dacCalLow;
	}

	public int getDacCalHigh()
	{
		return dacCalHigh;
	}

	public int getPowerUpCurrentLimit()
	{
		return powerUpCurrentLimit;
	}

	public int getRunTimeCurrentLimit()
	{
		return runTimeCurrentLimit;
	}

	public int getPowerUpTime()
	{
		return powerUpTime;
	}

	public int getUsbFineResitor()
	{
		return usbFineResitor;
	}

	public int getAuxFineResistor()
	{
		return auxFineResistor;
	}

	public int getInitialUsbVoltage()
	{
		return initialUsbVoltage;
	}

	public int getInitialAuxVoltage()
	{
		return initialAuxVoltage;
	}

	public int getHardwareRevision()
	{
		return hardwareRevision;
	}

	public int getTemperatureLimit()
	{
		return temperatureLimit;
	}

	public int getUsbPassthroughMode()
	{
		return usbPassthroughMode;
	}

	public int getMainCoarseResistor()
	{
		return mainCoarseResistor;
	}

	public int getUsbCoarseResistor()
	{
		return usbCoarseResistor;
	}

	public int getAuxCoarseResistor()
	{
		return auxCoarseResistor;
	}

	public int getDefMainFineResistor()
	{
		return defMainFineResistor;
	}

	public int getDefUsbFineResistor()
	{
		return defUsbFineResistor;
	}

	public int getDefAuxFineResistor()
	{
		return defAuxFineResistor;
	}

	public int getDefMainCoarseResistor()
	{
		return defMainCoarseResistor;
	}

	public int getDefUsbCoarseResistor()
	{
		return defUsbCoarseResistor;
	}

	public int getDefAuxCoarseResistor()
	{
		return defAuxCoarseResistor;
	}

	public int getEventCode()
	{
		return eventCode;
	}

	public int getEventData()
	{
		return eventData;
	}

	public int getCheckSum()
	{
		return checkSum;
	}

	@Override
	public String toString()
	{
		String ret = "";
		
		ret += String.format("Packet length: %d\n" , packetLength);
		ret += String.format("Packet type: %d\n" , packetType);
		ret += String.format("Firmware version: %d\n" , firmwareVersion);
		ret += String.format("Protocol version: %d\n" , protocolVersion);
		ret += String.format("Main fine current: %d\n" , mainFineCurrent);
		ret += String.format("Usb fine current: %d\n" , usbFineCurrent);
		ret += String.format("Aux fine current: %d\n" , auxFineCurrent);
		ret += String.format("Voltage 1: %d\n" , voltage1);
		ret += String.format("Main coarse current: %d\n" , mainCoarseCurrent);
		ret += String.format("Usb coarse current: %d\n" , usbCoarseCurrent);
		ret += String.format("Aux coarse current: %d\n" , auxCoarseCurrent);
		ret += String.format("Voltage 2: %d\n" , voltage2);
		ret += String.format("Output voltage setting: %d\n" , outputVoltageSetting);
		ret += String.format("Temperature: %d\n" , temperature);
		ret += String.format("Status: %d\n" , status);
		ret += String.format("Reserved: %d\n" , reserved);
		ret += String.format("Leds: %d\n" , leds);
		ret += String.format("Main fine resistor: %d\n" , mainFineResistor);
		ret += String.format("Serial number: %d\n" , serialNumber);
		ret += String.format("Sample rate: %d\n" , sampleRate);
		ret += String.format("Dac cal. low: %d\n" , dacCalLow);
		ret += String.format("Dac cal. high: %d\n" , dacCalHigh);
		ret += String.format("Power up current limit: %d\n" , powerUpCurrentLimit);
		ret += String.format("Run time current limit: %d\n" , runTimeCurrentLimit);
		ret += String.format("Power up time: %d\n" , powerUpTime);
		ret += String.format("Usb fine resistor: %d\n" , usbFineResitor);
		ret += String.format("Aux fine resistor: %d\n" , auxFineResistor);
		ret += String.format("Initial usb voltage: %d\n" , initialUsbVoltage);
		ret += String.format("Initial aux voltage: %d\n" , initialAuxVoltage);
		ret += String.format("Hardware revision: %d\n" , hardwareRevision);
		ret += String.format("Temperature limit: %d\n" , temperatureLimit);
		ret += String.format("Usb pass-through mode: %d\n" , usbPassthroughMode);
		ret += String.format("Main coarse resistor: %d\n" , mainCoarseResistor);
		ret += String.format("Usb coarse resistor: %d\n" , usbCoarseResistor);
		ret += String.format("Aux coarse resistor: %d\n" , auxCoarseResistor);
		ret += String.format("Default main fine resistor: %d\n" , defMainFineResistor);
		ret += String.format("Default usb fine resistor: %d\n" , defUsbFineResistor);
		ret += String.format("Default aux fine resistor: %d\n" , defAuxFineResistor);
		ret += String.format("Default main coarse resistor: %d\n" , defMainCoarseResistor);
		ret += String.format("Default usb coarse resistor: %d\n" , defUsbCoarseResistor);
		ret += String.format("Default main coarse resistor: %d\n" , defAuxCoarseResistor);
		ret += String.format("Event code: %d\n" , eventCode);
		ret += String.format("Event data: %d\n" , eventData);
		ret += String.format("Checksum: %d\n" , checkSum);
		
	    return ret;
	}
	
}
