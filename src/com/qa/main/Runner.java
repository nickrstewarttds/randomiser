package com.qa.main;

// here i'm importing a java utility - a random number generator
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		System.out.println(roll2D20());
	}
	
	public static int roll2D20() {
		int total = 0;
		total += rollD20();
		total += rollD20();
		return total;
	}
	
	public static int rollD20() {
		// here i'll use the random number generator
		// first, i'll make a variable for it - called 'randomiser'
		// this has the type Random - the thing i've imported
		// and then i assign 'randomiser' to be a new instance of the class Random
		Random randomiser = new Random();
		
		// then i can call all the methods inside that class, such as nextInt()
		return randomiser.nextInt(21);
	}


}
