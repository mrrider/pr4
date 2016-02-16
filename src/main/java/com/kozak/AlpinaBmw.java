package com.kozak;

public class AlpinaBmw implements Car {
	
	private String horsepower;
	
	public AlpinaBmw() {
	}

	public void drive() {
		System.out.println("Bmw Alpina have " + horsepower + ", and do ");
		doVoice.doVoice();
	}
	
	private Do doVoice;
	public void setDoVoice(Do doVoice) {
		this.doVoice = doVoice;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	
}
