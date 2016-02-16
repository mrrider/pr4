package com.kozak;

public class BMW implements Car {
	private int horsepower = 244;

	public BMW() {
	}

	public void drive() {
		System.out.println("This bmw have " + horsepower + " horsepowers!");
	}

}
