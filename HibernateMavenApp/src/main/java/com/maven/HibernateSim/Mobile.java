package com.maven.HibernateSim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {
	
	@Autowired
	@Qualifier("Airtel")
	Sim sim;

	public Mobile() {
		super();
		System.out.println("Mobile");
	}

	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}

	public void makeCall() {
		sim.call();
	}
	
	public Sim getSim() {
		return sim;
	}

	public void browseInternet() {
		sim.browse();
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void sendSMS() {
		sim.sendSMS();
	}
	public void sendMMS() {
		sim.sendMMS();
	}
	public void showAllNetworks() {
		sim.showSupportedNetworks();
	}

}
