package com.moodAnalyser1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTestCase {
	
	@Test
	public void SadtestforAnalyseMoodwithconstructor() {
		MoodAnalyser Analyser=new  MoodAnalyser("I am in sad Mood now");
		String result=Analyser.AnalyseMood();
		String expectedResult="SAD";
		assertEquals(expectedResult, result);
	}
}
