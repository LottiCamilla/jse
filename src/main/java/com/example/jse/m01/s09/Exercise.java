package com.example.jse.m01.s09;

public class Exercise {
    public static void main(String[] args) {
        // (1) create an array with "one", "two", "three", "four" in it
        // (2) print the number of its elements
        // (3) print the last element
    	
    	String[] data = {"one", "two", "three", "four"};
    	System.out.println("L'array ha un lunghezza pari a " + data.length);
    	System.out.println("L'ultimo valore è " + data[data.length - 1]);

        System.out.println("Done");
    }
}
