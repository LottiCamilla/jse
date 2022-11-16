package com.example.jse.m05.s06;

public class Exercise {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Pass me one argument!");
		} else {
			// (1) check if the argument contains only ciphers
			// (2) check if the argument contains at least one cipher

			System.out.println("args[0] = " + args[0]);
			boolean check1 = true;
			boolean check2 = false;
			for (char c : args[0].toCharArray()) {
				if (Character.isDigit(c)) {
					check2 = true;
				} else {
					check1 = false;
				}
			}

			System.out.println("(1) the argument contains only ciphers: \t" + check1);
			System.out.println("(2) the argument contains at least one cipher: \t" + check2);
		}
	}
}
