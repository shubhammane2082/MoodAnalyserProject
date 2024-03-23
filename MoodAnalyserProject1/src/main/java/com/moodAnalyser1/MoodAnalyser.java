package com.moodAnalyser1;

public class MoodAnalyser 
{
	private String message;
	
	public MoodAnalyser() {}
	
	public MoodAnalyser(String message)
	{
		this.message=message;
	}
	public String AnalyseMood() 
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
