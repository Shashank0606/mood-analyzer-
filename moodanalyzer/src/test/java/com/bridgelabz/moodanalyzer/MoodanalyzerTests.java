package com.bridgelabz.moodanalyzer;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

    public void testMoodAnalysis_whenMoodIsSad() {
        Moodanalyzer Moodanalyzer = new Moodanalyzer("This is a sad message");//Tc1.1 Refactor
        String mood = Moodanalyzer.analyseMood();
        Assert.assertEquals(mood,"SAD");
    }

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {//Tc1.2 Refactor
        Moodanalyzer Moodanalyzer = new Moodanalyzer("This is a happy message");
        String mood1 = Moodanalyzer.analyseMood();
        Assert.assertEquals(mood1,"HAPPY");
    }
    @Test
    public void testMoodAnalysis_whenMoodIsNull() { //tc 2.1
        Moodanalyzer moodAnalyzer = new Moodanalyzer(null);
        String mood2 = Moodanalyzer.analyseMood();
        Assert.assertEquals(mood2,"HAPPY");
    }
}
