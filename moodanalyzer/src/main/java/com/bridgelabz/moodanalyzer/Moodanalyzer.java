package com.bridgelabz.moodanalyzer;

public class Moodanalyzer {
	private String message;

	// Default Constructor
	public Moodanalyzer() {
	}

	// Parameterized Constructor
	public Moodanalyzer(String message) {
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