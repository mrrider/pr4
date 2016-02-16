package com.kozak;

public class Track {
	private Track(){
		System.out.println("This is track for my cars");
	}
	
	private static class TrackSingleton{
		static Track instance = new Track();
	}
	
	public static Track getInstance(){
		return TrackSingleton.instance;
	}
}
