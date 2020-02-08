package com.firstproject.maven_first;

import java.util.*;

public class GiftAnalaysis {
	
	static Scanner input = new Scanner(System.in);
	
	public static void inputChocolates() {
		
		System.out.println("Enter the no. of chocolates in gifts: ");
		int numbersofChoco = input.nextInt();
		int i = 0, chocoWeight = 0, chocoPrice = 0;
		for(int chocoCount=1; chocoCount<= numbersofChoco; chocoCount++) {
			
			System.out.println("\nEnter the weight of the Chocolate " + i + ":");
			chocoWeight += input.nextInt();
			System.out.println("\nEnter the price of the Chocolate " + i + ":");
			chocoPrice += input.nextInt();
			i++;
			
		}
		
		Chocolate choco = new Chocolate(chocoWeight,chocoPrice);
		
		choco.display();
	}
	
	public static void inputSweets() {
		
		System.out.println("\nEnter the no. of sweets in gifts: ");
		int numbersweets = input.nextInt();
		
		int j = 0, sweetWeight = 0, sweetPrice = 0;
		for(int sweetCount=1; sweetCount<= numbersweets; sweetCount++) {
			
			System.out.println("\nEnter the weight of the sweet " + j + ":");
			sweetWeight += input.nextInt();
			System.out.println("\nEnter the price of the sweet " + j + ":");
			sweetPrice += input.nextInt();
			j++;	
		}
		
		Sweets sweet = new Sweets(sweetWeight,sweetPrice);
		
		sweet.display();
		
	}
	
	public static int calcTotalWeight() {
		//Chocolate c = new Chocolate();
		//Sweets s = new Sweets();	
		
		int totalWeight = Sweets.getweight() + Chocolate.getweight();
		
		return totalWeight;
		
	}
	
	public static void inputCandies() {
		
		System.out.println("\nEnter the lower range: ");
		int lower = input.nextInt();
		System.out.println("Enter the upper range: ");
		int upper = input.nextInt();
		
		Candy can = new Candy(lower,upper);
		
		can.display();
		
	}
	
	
	public static void main(String args[]) {
		
	inputChocolates();
	
	inputSweets();
	
	System.out.println("\nEnter information about Candies: ");
	
	inputCandies();
	
	System.out.println("\nTotal weight of the Chocolates: " + calcTotalWeight());
	
	Gulabjamun gul = new Gulabjamun();
	Rasmalai ras = new Rasmalai();
	
	gul.eat();
	gul.recipe();
	
	ras.eat();
	ras.recipe();
	
	
	}
}
