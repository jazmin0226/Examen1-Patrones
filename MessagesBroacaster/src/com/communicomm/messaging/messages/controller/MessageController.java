package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessageController {
	private ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	private ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	private ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	private ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	private ArrayList<BootstrapOperationRequest> ReceivedBootstrapOperationRequest = new ArrayList<BootstrapOperationRequest>();
	private ArrayList<BootstrapOperationResponse> ReceivedBootstrapOperationResponse = new ArrayList<BootstrapOperationResponse>();
	
	public void sendMessage(int messageOption) {
		if (messageOption == 1){
			sentPingRequest.add(new PingServerRequest());
		}
		if (messageOption == 2) {
			receivedPingResponse.add(new PingServerResponse());
		}
		if (messageOption == 3) {
			sentWaitForSignalRequest.add(new SetWaitForSignalRequest());
		}
		if (messageOption == 4){ 
			ReceivedWaitForSignalResponse.add(new SetWaitForSignalResponse());
		}
		if (messageOption == 5){ 
			ReceivedWaitForSignalResponse.add(new SetWaitForSignalResponse());
		}
		if (messageOption == 6){ 
			ReceivedWaitForSignalResponse.add(new SetWaitForSignalResponse());
		}
		
	}

	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (PingServerRequest currentRequest: sentPingRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 2){
			for (PingServerResponse currentResponse: receivedPingResponse){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 3){
			for (SetWaitForSignalRequest currentRequest: sentWaitForSignalRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 4){
			for (BootstrapOperationRequest currentResponse: ReceivedBootstrapOperationRequest){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 5){
			for (BootstrapOperationRequest currentResponse: ReceivedBootstrapOperationRequest){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 6){
			for (BootstrapOperationResponse currentResponse: ReceivedBootstrapOperationResponse){
				System.out.println(currentResponse);
			}
		}
		
	}

}
