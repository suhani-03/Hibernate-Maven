package com.maven.HibernateSim;

import org.springframework.beans.factory.annotation.Value;

public class MessageSender {

	
	int smsCharge;
	
	int mmsCharge;
	
	public int getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(int smsCharge) {
		this.smsCharge = smsCharge;
	}
	public int getMmsCharge() {
		return mmsCharge;
	}
	public void setMmsCharge(int mmsCharge) {
		this.mmsCharge = mmsCharge;
	}
	
	public void sendSMSt() {
		System.out.println("SMS Charges: "+smsCharge);
	}
	public void sendMMSt() {
		System.out.println("MMS Charges: "+mmsCharge);
	}
	public MessageSender() {
		super();
		System.out.println("Message Sender Ready");
	}
	public MessageSender(int smsCharge, int mmsCharge) {
		super();
		this.smsCharge = smsCharge;
		this.mmsCharge = mmsCharge;
	}
	

}
