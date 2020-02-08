package com.firstproject.maven_first;

public class Candy {
	
	int lower,upper;
	
	public Candy(int low,int up) {
		
		this.lower = low;
		this.upper=up;
		
	}
	
	public void display() {
		
		System.out.println("Lower range of candies: " + lower);
		System.out.println("Upper range of candies: " + upper);
	}
	
	
}
