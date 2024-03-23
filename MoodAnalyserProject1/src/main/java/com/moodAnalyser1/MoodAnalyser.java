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
		try{
			if(message == null)
				throw new NullPointerException("Invalid Mood...");
		}catch(Exception e) {
			return "HAPPY";
		}
		if(message.contains("sad")) {
			return "SAD";
		}
		else if(message.contains("happy")) {
			return "HAPPY";
		}
		return "";
	}
}
