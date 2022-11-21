package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Vehicle {
    private static final Logger log = Logger.getGlobal();

    public Vehicle() {
        log.info("Vehicle created");
    }
    
    public void steer(boolean right) {
    	if (right) {
    		System.out.println("Steer right");
    	} else {
    		System.out.println("Steer left");
    	}
    }
    
    public void brake() {
    	System.out.println("Brake");
    }

	@Override
	public String toString() {
		return "Vehicle [toString()=" + super.toString() + "]";
	}
    
}
