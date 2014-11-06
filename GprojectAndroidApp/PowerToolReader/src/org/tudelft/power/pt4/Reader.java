package org.tudelft.power.pt4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.preon.DecodingException;

public class Reader
{
	
	public static void main(String[] args) throws FileNotFoundException, DecodingException, IOException
	{
		
		PT4File file = PT4File.read(new File("pt4samples/PowerBox.pt4"));
		// System.out.println(file.getHeader());
		// System.out.println(file.getStatus());
		
		for (Sample sample : file.getSamples())
			if (!sample.isMissing())
				System.out.println(sample);
//		for (int i=0; i<10; i++)
//			System.out.println(file.getSamples().get(i));
		
	}

}
