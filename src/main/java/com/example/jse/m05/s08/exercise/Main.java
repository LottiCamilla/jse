package com.example.jse.m05.s08.exercise;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("#.##");
    	
        Square square = new Square(3.0);
        System.out.println("Area is: " + df.format(square.area()));
        System.out.println("Perimeter is: " + df.format(square.perimeter()));

        Circle circle = new Circle(4.0);
        System.out.println("Area is: " + df.format(circle.area()));
        System.out.println("Perimeter is: " + df.format(circle.perimeter()));
    }
}
