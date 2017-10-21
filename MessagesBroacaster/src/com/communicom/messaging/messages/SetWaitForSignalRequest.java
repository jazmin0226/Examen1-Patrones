package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends FactoryMessages
{
	private int messageNumber;
	private SignalType signal;
	private String signalValue;
	
	public SetWaitForSignalRequest() {
		super();
		this.messageNumber = 3;
		super.name = "Set Wait For Signal Request";
	}

	public SetWaitForSignalRequest(String sourceAddress, String targetAddress) 
	{
		super(sourceAddress, targetAddress);
		this.messageNumber = 3;
		super.name = "Set Wait For Signal Request";
	}
	
	public int getMessageNumber() {
		return messageNumber;
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
}
