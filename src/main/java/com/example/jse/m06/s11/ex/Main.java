package com.example.jse.m06.s11.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // (1) put objects of (at least) three different types in this array
        Vehicle[] vehicles = {new Bus(), new Car(), new MotorBike()};
        System.out.println(Arrays.toString(vehicles));

        // (2) let all vehicle steer in alternate directions
        boolean right = true;
        for (Vehicle vehicle: vehicles) {
        	vehicle.steer(right);
        	right = !right;
        }

        // (3) put objects of (at least) three different types in this array
        Conditioning[] conditioned = {new Bus(), new Car(), new Flat()};
        System.out.println(Arrays.toString(conditioned));

        // (4) set the temperature of each conditioned to 20
        int temperature = 20;
        for (Conditioning conditioning: conditioned) {
        	conditioning.setTemperature(temperature);
        }
        System.out.println(Arrays.toString(conditioned));
    }
}
