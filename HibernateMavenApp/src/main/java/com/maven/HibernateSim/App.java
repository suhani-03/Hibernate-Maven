package com.maven.HibernateSim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//loading ioc container
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//    	Sim sim = (Sim) context.getBean("Airtel");
    	Mobile m = context.getBean("Mobile", Mobile.class);
//    	m.setSim(sim);
    	m.browseInternet();
    	m.getSim().setCallCharge(2.68f);
    	m.makeCall();
    	m.sendSMS();
    	m.sendMMS();
    	m.showAllNetworks();
    	
    	System.out.println();
    	
    	Mobile nokia = context.getBean("Mobile", Mobile.class);
    	nokia.makeCall();
    	
//    	sim = context.getBean("Idea", Idea.class); 
    	
    }


}
