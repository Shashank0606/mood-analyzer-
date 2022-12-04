package com.bridgelabz.moodanalyser;

public class Moodanalyser {
	public String analyseMood(String message) {

		if (message.contains("happy"))
			return "HAPPY";
		else
			return "SAD";
	}
}