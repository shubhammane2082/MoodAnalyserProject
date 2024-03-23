package com.moodAnalyser1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyserTestCase {
	
	MoodAnalyser Analyser=new  MoodAnalyser();
	@Test
	public void SadtestforAnalyseMood() {
		String result=Analyser.AnalyseMood("I am in sad mood now");
		String expectedResult="SAD";
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void HappytestforAnalyseMood() {
		String result=Analyser.AnalyseMood("I am in happy mood now");
		String expectedResult="HAPPY";
		assertEquals(expectedResult, result);
	}

}
