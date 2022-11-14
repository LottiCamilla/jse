package com.example.jse.m02.s12.ex;

public class Exercise4 {
	public static void main(String[] args) {
		/*
		 * Print up to 3 args
		 * 
		 * ["ciao", "hello"] -> "ciao" "hello"
		 * 
		 * ["ciao", "hello", "ciao", "hello"] -> "ciao" "hello", "ciao"
		 */

		int len = args.length < 3 ? args.length : 3; // len = Math.min(3, args.length);
		for (int i = 0; i < len; i++) {
			System.out.println("Argomento " + i + ": " + args[i]);
		}
		
//		switch (args.length) {
//		default:
//			// FALL THROUGH
//		case 3:
//			System.out.println(args[2]);
//			// FALL THROUGH
//		case 2:
//			System.out.println(args[1]);
//			// FALL THROUGH
//		case 1:
//			System.out.println(args[0]);
//			// FALL THROUGH
//		case 0: 
//			break;
//		}
	}
}
