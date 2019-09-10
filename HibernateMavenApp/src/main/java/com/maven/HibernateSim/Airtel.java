package com.maven.HibernateSim;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.maven.HibernateSim.MessageSender;


public class Airtel implements Sim {
	
//	int internetSpeed;
//	float callCharge;
	
	@Value("${internetSpeed}")
	int internetSpeed;
	@Value("${callCharge}")
	float callCharge;
	
	@Autowired
	MessageSender mss;
	Map<String,Integer> supportedNetworks;
	
	public Map<String, Integer> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(Map<String, Integer> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

	public Airtel(int internetSpeed, float callCharge, MessageSender mss, Map<String, Integer> supportedNetworks,
			List<String> networks, List<Integer> years) {
		super();
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
		this.mss = mss;
		this.supportedNetworks = supportedNetworks;
	}

//	
//	
//	@Value("${networkTypes}")
//	List<String> networks;
//	@Value("${years}")
//	List<Integer> years;

	public MessageSender getMss() {
		return mss;
	}

	public void setMss(MessageSender mss) {
		this.mss = mss;
	}

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

	@Override
	public void browse() {
		System.out.println("Browsing speed"+internetSpeed+"mbps");
		
	}

	@Override
	public void call() {
		System.out.println("Call charges from Airtel:"+callCharge+"/min");
		
	}

	@Override
	public void sendSMS() {
		mss.sendSMSt();
//		System.out.println("SMS charges from Airtel: "+smsCharge);
		
	}
	
	public void sendMMS() {
		mss.sendMMSt();
	}

	public Airtel() {
		super();
		System.out.println("Airtel Sim Initialised");
	}
	
	public void showSupportedNetworks() {
		System.out.println("Supported Networks");
//		if(supportedNetworks!=null)
		supportedNetworks.forEach(
				(k,v)->System.out.println("Net type = "+k+"...Year introduced "+v));
	}

	public Airtel(int internetSpeed, float callCharge) {
		super();
		System.out.println("Airtel sim initialised...");
		this.internetSpeed = internetSpeed;
		this.callCharge = callCharge;
	}
}
