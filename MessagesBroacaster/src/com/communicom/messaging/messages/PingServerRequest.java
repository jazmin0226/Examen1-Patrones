package com.communicom.messaging.messages;


public class PingServerRequest extends FactoryMessages
{
	private int messageNumber;
	
	public PingServerRequest()
	{
		super();
		this.messageNumber = 1;
		super.name = "Ping Server Request";
	}
	
	public PingServerRequest(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 1;
		super.name = "Ping Server Request";
	}
	
	public int getMessageNumber() 
	{
		return messageNumber;
	}

	@Override
	public String toString() {
		return  "Name =" + getName() + 
				", MessageNumber =" + getMessageNumber() + 
				", getEmisionTime =" + getEmisionTime();
	}

	
	
	
	
}
