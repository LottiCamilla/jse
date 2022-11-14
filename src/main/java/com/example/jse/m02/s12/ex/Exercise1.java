package com.example.jse.m02.s12.ex;

public class Exercise1 {
    public static void main(String[] args) {
        // Print all values in [0 .. 9]
        // (1) for loop
        // (2) while loop
        // (3) do-while loop
    	
    	System.out.println("for");
    	int valueMax = 10;
    	for (int i = 0; i < valueMax; i++) {
    		System.out.println(i);
    	}
    	
    	System.out.println("while");
    	int i = 0;
    	while(i < valueMax) {
    		System.out.println(i);
    		i++;
    	}
    	
    	System.out.println("do while");
    	int j = 0;
    	do {
    		System.out.println(j);
    		j++;
    	} while(j < valueMax);
    }
}
