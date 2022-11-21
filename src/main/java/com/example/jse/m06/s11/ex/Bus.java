package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Bus extends Vehicle implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    public Bus() {
        log.info("Bus created");
    }

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Bus [temperature=" + temperature + "]";
	}
}
