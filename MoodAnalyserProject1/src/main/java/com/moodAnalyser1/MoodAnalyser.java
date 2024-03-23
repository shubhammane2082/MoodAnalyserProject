package com.moodAnalyser1;

public class MoodAnalyser 
{
	public String AnalyseMood(String message) 
	{
		if(message.contains("sad")) {
			return "SAD";
		}
		else if(message.contains("happy")) {
			return "HAPPY";
		}
		return "";
	}
}
