package com.marcelodev.telephoneDevices;

public class Phone implements TelephoneDevice {

	@Override
	public void toConect() {
	    System.out.println("calling");
		
	}

	@Override
	public void toMeet() {
		System.out.println("serving");
		
	}

	@Override
	public void startVoicemail() {
		System.out.println("starting voicemail");
		
	}

}
