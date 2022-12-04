package com.bridgelabz.moodanalyser;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class MoodanalyserTests {

	@Test
	public void testMoodAnalysis_whenMoodIsSad() { // TC 1.1 "I am in sad mood"
		Moodanalyser moodAnalyzer = new Moodanalyser();
		String mood = moodAnalyzer.analyseMood("I am in sad mood");
		Assert.assertEquals(mood, "SAD");
	}

	@Test
	public void testMoodAnalysis_whenMoodIsHappy() { // TC 1.2 I am in happy mood
		Moodanalyser moodAnalyzer = new Moodanalyser();
		String mood1 = moodAnalyzer.analyseMood("I am in happy mood");
		Assert.assertEquals(mood1, "HAPPY");
	}
}