package org.tudelft.power.pt4;

import org.codehaus.preon.annotation.BoundEnumOption;


public enum VOutSetting
{
	
	@BoundEnumOption(value = 0)
	Typical,
	
	@BoundEnumOption(value = 1)
	Low,
	
	@BoundEnumOption(value = 2)
	High,
	
	@BoundEnumOption(value = 3)
	Custom

}
