package com.bridgelabz.moodanalyzer

import org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalysis_whenMoodIsSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
		String mood;

		Assert.assertEquals("SAD", mood);
	}catch(

	MoodAnalysisException e)
	{
		e.printStackTrace();
	}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMoodAnalysis_whenMoodIsNull_ShouldThrowException() {//uc 3.1
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyseMood();
		

	}

	// Custom Exception if User Provides Invalid Mood 
	 //Input message: empty
		Test

	public void testMoodAnalysis_whenMoodIsEmpty_ShouldThrowException() {// uc3.2
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			System.out.println(e);

			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
