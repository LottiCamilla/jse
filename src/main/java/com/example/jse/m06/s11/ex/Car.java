package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

public class Car extends Vehicle implements Conditioning{
    private static final Logger log = Logger.getGlobal();
    private int temperature;

    public Car() {
        log.info("Car created");
    }

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Car [temperature=" + temperature + "]";
	}
}
