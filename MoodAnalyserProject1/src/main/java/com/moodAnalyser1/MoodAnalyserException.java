package com.moodAnalyser1;

public class MoodAnalyserException extends Exception 
{
	enum Mood{
		HAPPY,SAD,NULL,EMPTY;
	}
	
	public MoodAnalyserException(String message)
	{
		super(message);
	}
}
