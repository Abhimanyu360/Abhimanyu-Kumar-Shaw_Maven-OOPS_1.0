package com.firstproject.maven_first;

public class Chocolate {

	static int totalweight;
	static int totalprice;
	
	public Chocolate() {
		
	}
	
	public Chocolate(int weight,int price) {
		
		totalweight = weight;
		totalprice = price;
			
	}
	
	public void display() {
		
		System.out.println("Total weight of all the Chocolates: "+totalweight);
		System.out.println("Total price of all the Chocolates: "+totalprice);
	}
	
	public static int getweight() {
		
		return totalweight;
	}
	
}
