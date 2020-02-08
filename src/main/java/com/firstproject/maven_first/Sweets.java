package com.firstproject.maven_first;

public class Sweets {
	static int totalweight;
	static int totalprice;
	
	public Sweets() {
		
	}
	
	public Sweets(int weight,int price) {
		
		totalweight = weight;
		totalprice = price;
			
	}
	
	public void display() {
		
		System.out.println("Total weight of all the Sweets: "+totalweight);
		System.out.println("Total price of all the Sweets: "+totalprice);
	}
	
	public static int getweight() {
		
		return totalweight;
	}
}
