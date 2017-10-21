package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends FactoryMessages 
{
	private int messageNumber;
	
	public BootstrapOperationResponse()
	{
		super();
		this.messageNumber = 6;
		super.name = "Bootstrap Operation Response";
	}
	
	public BootstrapOperationResponse(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 6;
		super.name ="Bootstrap Operation Response";
	}
	
	public int getMessageNumber() 
	{
		return messageNumber;
	}

	@Override
	public String toString() 
	{
		return "Message Number =" + getMessageNumber() + 
				", getName =" + getName() + 
				", getEmisionTime =" + getEmisionTime();
	}

	

}
