package com.kozak;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class Audi implements Car {

	public Audi() {
	}

	private Collection<Do> voices;

	public void drive() {
		for (Do instrument : voices) {
			instrument.doVoice();
		}
	}
	
	@Autowired(required=false)
	public void setVoices(Collection<Do> voices) {
		this.voices = voices;
	}

}
