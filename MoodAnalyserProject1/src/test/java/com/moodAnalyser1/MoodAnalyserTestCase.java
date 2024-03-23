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
	
	@Test
	public void HappytestforAnalyseMoodwithconstructor() {
		MoodAnalyser Analyser=new  MoodAnalyser("I am in happy Mood now");
		String result=Analyser.AnalyseMood();
		String expectedResult="HAPPY";
		assertEquals(expectedResult, result);
	}
	@Test
	public void checkMoodNull() {
		MoodAnalyser Analyser=new  MoodAnalyser(null);
		String result=Analyser.AnalyseMood();
		System.out.println(result);
		String expectedResult="HAPPY";
		assertEquals(expectedResult, result);
	}
}
