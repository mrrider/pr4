package com.kozak;

import java.util.Map;

public class TuningAudi implements Car {
	public TuningAudi() {
	}

	public void drive() {
		for (String key : voicess.keySet()) {
			System.out.println(key + " : ");
			Do voice = voicess.get(key);
			voice.doVoice();
		}
	}

	private Map<String, Do> voicess;

	public void setVoicess(Map<String, Do> voicess) {
		this.voicess = voicess;
	}
}
