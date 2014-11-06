package org.tudelft.power.pt4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.preon.Codec;
import org.codehaus.preon.Codecs;
import org.codehaus.preon.DecodingException;

public class PT4File
{
	
	private final Header header;
	private final Status status;
	private List<Sample> samples;
	
	private PT4File(Header header, Status status, List<Sample> samples)
	{
		this.header = header;
		this.status = status;
		this.samples = samples;
	}
	
	public Header getHeader()
	{
		return header;
	}
	
	public Status getStatus()
	{
		return status;
	}
	
	public List<Sample> getSamples()
	{
		return samples;
	}
	
	public void skip(int skip)
	{
		this.samples = samples.subList(skip, samples.size()-1);
	}
	
	public static PT4File read(File file) throws FileNotFoundException, IOException, DecodingException
	{
		
		if (!file.exists())
			throw new FileNotFoundException();
		
		FileInputStream reader = new FileInputStream(file);

		// Read header
		byte[] headerBytes = new byte[Header.Size];
		reader.read(headerBytes);

		Codec<Header> headerCodec = Codecs.create(Header.class);
		Header header = Codecs.decode(headerCodec, headerBytes);
		
		// Read status
		reader.skip(header.getStatusOffset() - Header.Size);
		byte[] statusBytes = new byte[Status.Size];
		reader.read(statusBytes);
		
		Codec<Status> statusCodec = Codecs.create(Status.class);
		Status status = Codecs.decode(statusCodec, statusBytes);

		// Read samples
		reader.skip(1024 - header.getStatusOffset() - Status.Size);
		List<Sample> samples = new ArrayList<Sample>();
		int sampleNr = 0;
		while (reader.available()>0)
			samples.add(Sample.read(sampleNr++, reader, header));
		
		reader.close();	

		return new PT4File(header, status, samples);
	}

}
