package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends FactoryMessages
{
	private int messageNumber;
	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse() 
	{
		super();
		this.messageNumber = 4;
		super.name = "Set Wait For Signal Response";
	}

	public SetWaitForSignalResponse(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 4;
		super.name = "Set Wait For Signal Response";
	};

	public int getMessageNumber() 
	{
		return messageNumber;
	}

	public SignalType getSignal() 
	{
		return signal;
	}

	public void setSignal(SignalType signal) 
	{
		this.signal = signal;
	}

	public String getSignalExpectedValue() 
	{
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) 
	{
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() 
	{
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) 
	{
		this.signalReceivedValue = signalReceivedValue;
	}
}
