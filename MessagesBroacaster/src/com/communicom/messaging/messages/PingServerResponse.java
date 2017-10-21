package com.communicom.messaging.messages;


public class PingServerResponse extends FactoryMessages
{
	private int messageNumber;
	
	public PingServerResponse() 
	{
		super();
		this.messageNumber = 2;
		super.name = "Ping Server Response";
	}
	
	public PingServerResponse(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 2;
		super.name = "Ping Server Response";
	};
	
	public int getMessageNumber() 
	{
		return messageNumber;
	}
}
