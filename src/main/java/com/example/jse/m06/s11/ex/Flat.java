package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Flat implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    public Flat() {
        log.info("Flat created");
    }

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Flat [temperature=" + temperature + "]";
	}
}
