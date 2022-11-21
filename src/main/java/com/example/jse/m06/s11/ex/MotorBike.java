package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class MotorBike extends Vehicle{
    private static final Logger log = Logger.getGlobal();

    public MotorBike() {
        log.info("MotorBike created");
    }

	@Override
	public String toString() {
		return "MotorBike";
	}
}
