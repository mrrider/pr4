package com.kozak;

public class AmgMercedes extends Mercedes {
	private Tuning tuning;

	public AmgMercedes(Tuning tuning) {
		super();
		this.tuning = tuning;
	}
	public AmgMercedes(int househorses, Tuning tuning){
		super(househorses);
		this.tuning = tuning;
	}
	public void drive() {
		super.drive();
		System.out.println("+");
		tuning.upgrade();
	}

}
