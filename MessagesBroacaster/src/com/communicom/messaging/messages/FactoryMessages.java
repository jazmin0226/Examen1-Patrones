package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public abstract class FactoryMessages 
{
	protected String name;
	protected String sourceAddress;
	protected String targetAddress;
	protected LocalDateTime emisionTime;
	
	public FactoryMessages() 
	{
		this.emisionTime = LocalDateTime.now();
	}
	
	public FactoryMessages(String sourceAddress, String targetAddress) 
	{
		super();
		this.emisionTime = LocalDateTime.now();
	}
	
	
	public String getName() {
		return name;
	}

	public String getSourceAddress() 
	{
		return sourceAddress;
	}
	
	public void setSourceAddress(String sourceAddress) 
	{
		this.sourceAddress = sourceAddress;
	}
	
	public String getTargetAddress() 
	{
		return targetAddress;
	}
	
	public void setTargetAddress(String targetAddress) 
	{
		this.targetAddress = targetAddress;
	}
	
	public LocalDateTime getEmisionTime() 
	{
		return emisionTime;
	}
}
