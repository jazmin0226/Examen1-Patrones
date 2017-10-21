package com.communicom.messaging.messages;

public class BootstrapOperationRequest extends FactoryMessages 
{
	private int messageNumber;
	
	public BootstrapOperationRequest()
	{
		super();
		this.messageNumber = 5;
		super.name ="Bootstrap Operation Response";
	}
	
	public BootstrapOperationRequest(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 5;
		super.name ="Bootstrap Operation Response";
	}
	
	public int getMessageNumber() 
	{
		return messageNumber;
	}

	@Override
	public String toString() {
		return "Message Number =" + getMessageNumber() + 
				", getName =" + getName() + 
				", getEmisionTime =" + getEmisionTime();
	}

	

	
	
}
