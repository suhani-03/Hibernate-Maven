package com.maven.HibernateSim;

import java.util.Map;

public class Idea implements Sim {
	
	int internetSpeed;
	float callCharge;
	
	MessageSender mss;
	Map<String,Integer> supportedNetworks;

	public int getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(int internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public MessageSender getMss() {
		return mss;
	}

	public void setMss(MessageSender mss) {
		this.mss = mss;
	}

	public Map<String, Integer> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(Map<String, Integer> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

	@Override
	public void browse() {
		System.out.println("Internet speed: "+internetSpeed+"mbps");

	}

	@Override
	public void call() {
		System.out.println("Calling charges: "+callCharge+"/min");

	}

	@Override
	public void sendSMS() {
		mss.sendSMSt();
//		System.out.println("SMS charge: "+smsCharge);
	}
	
	public void sendMMS() {
		mss.sendMMSt();
	}

	public void showSupportedNetworks() {
		System.out.println("Supported Networks");
		supportedNetworks.forEach(
				(k,v)->System.out.println("Net type = "+k+"...Year introduced "+v));
	}
	
	public Idea(int phoneNo, int internetSpeed, float callCharge, float smsCharge) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
	}

	public Idea(int internetSpeed, float callCharge, MessageSender mss, Map<String, Integer> supportedNetworks) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.mss = mss;
		this.supportedNetworks = supportedNetworks;
	}

	public Idea() {
		super();
		System.out.println("Idea Sim Initialised");
	}
}
