package org.tudelft.power.pt4;

import java.util.Date;

import org.codehaus.preon.annotation.Bound;
import org.codehaus.preon.annotation.BoundList;
import org.codehaus.preon.annotation.BoundNumber;

public class Header
{
	
	public final static int Size = 212;
	
	private static final long TICKS_AT_EPOCH = 621355968000000000L;
    private static final long TICKS_PER_MILLISECOND = 10000;
    
    @BoundNumber(size="32")
	private int headerSize;

	@BoundList(size="20")
	private byte[] name;
	
	@BoundNumber(size="32")
	private int batterySize;

	@BoundNumber(size="64")
	private long captureDate;
	
	@BoundList(size="20")
	private byte[] serialNumber;

    @BoundNumber(size="32")
	private int calibrationStatus;
	
    @BoundNumber(size="32")
	private VOutSetting voutSetting;
	
    @Bound
	private float voutValue;
	
    @BoundNumber(size="32")
	private int hardwareRate;
	
    @Bound
	private float softwareRate;
    
    @BoundNumber(size="32")
	private int powerField;

    @BoundNumber(size="32")
	private int currentField;

    @BoundNumber(size="32")
	private int voltageField;

	@BoundList(size="30")
	private byte[] captureSetting;

	@BoundList(size="10")
	private byte[] swVersion;

    @BoundNumber(size="32")
	private RunMode runMode;
	
    @BoundNumber(size="32")
	private int exitCode;
	
    @BoundNumber(size="64")
	private long totalCount;
	
    @BoundNumber(size="16")
	private int statusOffset;
	
    @BoundNumber(size="16")
	private int statusSize;
	
    @BoundNumber(size="16")
	private int sampleOffset;
	
    @BoundNumber(size="16")
	private int sampleSize;

    @BoundNumber(size="16")
	private int initialMainVoltage;
	
    @BoundNumber(size="16")
	private int initialUsbVoltage;
	
    @BoundNumber(size="16")
	private int initialAuxVoltage;

    @BoundNumber(size="16")
	private int captureDataMask;
	
    @BoundNumber(size="64")
	private long sampleCount;
	
    @BoundNumber(size="64")
	private long missingCount;
	
    @BoundNumber(size="32")
	private float sumMainVoltage;
	
    @BoundNumber(size="32")
	private float sumMainCurrent;
	
    @BoundNumber(size="32")
	private float sumMainPower;
	
    @BoundNumber(size="32")
	private float sumUsbVoltage;
	
    @BoundNumber(size="32")
	private float sumUsbCurrent;
	
    @BoundNumber(size="32")
	private float sumUsbPower;
	
    @BoundNumber(size="32")
	private float sumAuxVoltage;
	
    @BoundNumber(size="32")
	private float sumAuxCurrent;
	
    @BoundNumber(size="32")
	private float sumAuxPower;
    
    public int getHeaderSize()
	{
		return headerSize;
	}
    
    public String getName()
	{
		return decodeString(name);
	}
    
    public int getBatterySize()
	{
		return batterySize;
	}
    
    public Date getCaptureDate()
	{
		return new Date((captureDate-TICKS_AT_EPOCH)/TICKS_PER_MILLISECOND);
	}
    
    public byte[] getSerialNumber()
	{
		return serialNumber;
	}
    
    public int getCalibrationStatus()
	{
		return calibrationStatus;
	}
    	
	public VOutSetting getVoutSetting()
	{
		return voutSetting;
	}

	public float getVoutValue()
	{
		return voutValue;
	}

	public int getHardwareRate()
	{
		return hardwareRate;
	}

	public float getSoftwareRate()
	{
		return softwareRate;
	}

	public int getPowerField()
	{
		return powerField;
	}

	public int getCurrentField()
	{
		return currentField;
	}

	public int getVoltageField()
	{
		return voltageField;
	}

	public byte[] getCaptureSetting()
	{
		return captureSetting;
	}

	public byte[] getSwVersion()
	{
		return swVersion;
	}

	public RunMode getRunMode()
	{
		return runMode;
	}

	public int getExitCode()
	{
		return exitCode;
	}

	public long getTotalCount()
	{
		return totalCount;
	}

	public int getStatusOffset()
	{
		return statusOffset;
	}

	public int getStatusSize()
	{
		return statusSize;
	}

	public int getSampleOffset()
	{
		return sampleOffset;
	}

	public int getSampleSize()
	{
		return sampleSize;
	}

	public int getInitialMainVoltage()
	{
		return initialMainVoltage;
	}

	public int getInitialUsbVoltage()
	{
		return initialUsbVoltage;
	}

	public int getInitialAuxVoltage()
	{
		return initialAuxVoltage;
	}

	public int getCaptureDataMask()
	{
		return captureDataMask;
	}

	public long getSampleCount()
	{
		return sampleCount;
	}

	public long getMissingCount()
	{
		return missingCount;
	}

	public float getSumMainVoltage()
	{
		return sumMainVoltage;
	}

	public float getSumMainCurrent()
	{
		return sumMainCurrent;
	}

	public float getSumMainPower()
	{
		return sumMainPower;
	}

	public float getSumUsbVoltage()
	{
		return sumUsbVoltage;
	}

	public float getSumUsbCurrent()
	{
		return sumUsbCurrent;
	}

	public float getSumUsbPower()
	{
		return sumUsbPower;
	}

	public float getSumAuxVoltage()
	{
		return sumAuxVoltage;
	}

	public float getSumAuxCurrent()
	{
		return sumAuxCurrent;
	}

	public float getSumAuxPower()
	{
		return sumAuxPower;
	}
	
	public boolean hasMainChannel()
	{
		return (captureDataMask & 0x1000) != 0;
	}

	public boolean hasUsbChannel()
	{
		return (captureDataMask & 0x2000) != 0;
	}

	public boolean hasAuxChannel()
	{
		return (captureDataMask & 0x4000) != 0;
	}

	private String decodeString(byte[] str)
	{
		byte strBytes[] = new byte[str[0]];
		System.arraycopy(str, 1, strBytes, 0, str[0]);
		return new String(strBytes);
	}

	@Override
	public String toString()
	{
		String ret = "";

		ret += String.format("Header size: %d\n", headerSize);
		ret += String.format("Serial number: %s\n", decodeString(name));
		ret += String.format("Battery size: %dmAh\n", batterySize);
		ret += String.format("Capture date: %d\n", captureDate);
		ret += String.format("Capture date: %s\n", getCaptureDate().toString());
		ret += String.format("Serial number: %s\n", decodeString(serialNumber));
		ret += String.format("Calibration status: %d\n", calibrationStatus);
		ret += String.format("V-out setting: %s\n", voutSetting.toString());
		ret += String.format("V-out value: %f\n", voutValue);
		ret += String.format("Hardware rate: %d\n", hardwareRate);
		ret += String.format("Software rate: %f\n", softwareRate);
		ret += String.format("Power field: %d\n", powerField);
		ret += String.format("Current field: %d\n", currentField);
		ret += String.format("Voltage field: %d\n", voltageField);
		ret += String.format("Capture setting: %s\n", decodeString(captureSetting));
		ret += String.format("Software version: %s\n", decodeString(swVersion));
		ret += String.format("Run mode: %s\n", runMode.toString());
		ret += String.format("Exit code: %d\n", exitCode);
		ret += String.format("Total count: %d\n", totalCount);
		ret += String.format("Status offset: %d\n", statusOffset);
		ret += String.format("Status size: %d\n", statusSize);
		ret += String.format("Sample offset: %d\n", sampleOffset);
		ret += String.format("Sample size: %d\n", sampleSize);
		ret += String.format("Initial main voltage: %d\n", initialMainVoltage);
		ret += String.format("Initial usb voltage: %d\n", initialUsbVoltage);
		ret += String.format("Initial aux voltage: %d\n", initialAuxVoltage);
		ret += String.format("Capture data mask: %d\n", captureDataMask);
		ret += String.format("Sample count: %d\n", sampleCount);
		ret += String.format("Missing count: %d\n", missingCount);
		ret += String.format("Sum main voltage: %f\n", sumMainVoltage);
		ret += String.format("Sum main current: %f\n", sumMainCurrent);
		ret += String.format("Sum main power: %f\n", sumMainPower);
		ret += String.format("Sum usb voltage: %f\n", sumUsbVoltage);
		ret += String.format("Sum usb current: %f\n", sumUsbCurrent);
		ret += String.format("Sum usb power: %f\n", sumUsbPower);
		ret += String.format("Sum aux voltage: %f\n", sumAuxVoltage);
		ret += String.format("Sum aux current: %f\n", sumAuxCurrent);
		ret += String.format("Sum aux power: %f\n", sumAuxPower);

	    return ret;
	}
	
}
