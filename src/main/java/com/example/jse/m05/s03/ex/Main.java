package com.example.jse.m05.s03.ex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
		String[] colors = { "blue", "green", "yellow", "black", "blue" };

		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(colors));

		// (1) Create an array of cats, same size of the arrays above
		Cat[] cats = new Cat[names.length];
		System.out.println(String.format("There are %d cats in the array", Cat.getCount()));

		// (2) initialize the cats array
		// each cat should have name and color from the arrays above
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat(names[i], colors[i]);
		}

		System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));

		// (3) each cat should meow
		System.out.println("(3)");
		for (int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}

		// (4) each cat named Kit should meow
		System.out.println("(4)");
		for (Cat cat : cats) {
			if (cat.getName().equals("Kit")) {
				cat.meow();
			}
		}

		// (5) only the first cat named Kit should meow
		System.out.println("(5)");
		for (Cat cat : cats) {
			if (cat.getName().equals("Kit")) {
				cat.meow();
				break;
			}
		}
		
		// (5a) only the last cat named Kit should meow
		System.out.println("(5a)");
		for (int i = cats.length - 1; i >= 0; i--) {
			if (cats[i].getName().equals("Kit")) {
				cats[i].meow();
				break;
			}
		}

		// (6) only the cats in even position should meow
		System.out.println("(6)");
		for (int i = 0; i < cats.length; i++) {
			if (i % 2 == 0) {
				cats[i].meow();
			}
		}
	}
}
