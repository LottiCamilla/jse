package com.example.jse.m02.s12.ex;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * Print 
         * (1) the number of arguments passed to this main
         * (2) each argument
         */
    	
    	System.out.println("Il numero degli argomenti è: " + args.length);
    	
    	for (int i = 0; i < args.length; i++) {
    		System.out.println("Argomento " + i + ": " + args[i]);
    	}
    	
//    	for (String arg: args) {
//    		System.out.println(arg);
//    	}
    }
}
