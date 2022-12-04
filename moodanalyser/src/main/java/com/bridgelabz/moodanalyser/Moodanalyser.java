package com.bridgelabz.moodanalyser;

public class Moodanalyser {
	private String message;

	// Default Constructor
	public Moodanalyser() {
	}

	// Parameterized Constructor
	public Moodanalyser(String message) {
		this.message = message;
	}

	// Handle NULLPOINTER Exception using try-catch block
	public String analyseMood() {
		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			return "HAPPY";
		}
	}
}