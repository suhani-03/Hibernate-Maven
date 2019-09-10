package com.maven.HibernateSim;

public interface Sim {
	
	void browse();
	void call();
	void sendSMS();
	void sendMMS();
	void showSupportedNetworks();
	void setCallCharge(float callCharge);

}
