package com.example.jse.m05.s08.exercise;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return Math.pow(side, 2);
    }

    public double perimeter() {
        return 4 * side;
    }
}
