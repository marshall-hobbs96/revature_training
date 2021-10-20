package com.revature.model;

public class Car {

	String make;
	String model;
	int year; 
	int milesPerGallon;
	int maxFuel; 
	double currentFuel; 
	
	public Car(String make, String model, int year, int maxFuel, int milesPerGallon) {
		
		this.make = make; 
		this.model = model; 
		this.year = year; 
		this.maxFuel = maxFuel; 
		this.milesPerGallon = milesPerGallon;
		
	}
	
	public Car(String make, String model, int year, int maxFuel, int milesPerGallon, double startingFuel) {
		
		this(make, model, year, maxFuel, milesPerGallon);
		this.currentFuel = startingFuel; 
		
	}
	
	public void range() {
		
		double milesRemaining = this.currentFuel * this.milesPerGallon;
		System.out.println(milesRemaining + " miles remaining!"); 
		System.out.println();
		
	}
	
	public void drive(int miles) {		//drive for specified miles
		
		float gallonsBurned = miles / this.milesPerGallon; 
		if (gallonsBurned > this.currentFuel) {
			
			System.out.println("Not enough fuel!!!");
			System.out.println();
			
		}
		
		else {
			
			
			this.currentFuel = this.currentFuel - gallonsBurned; 
			System.out.println("Driving " + miles + " miles!");
			System.out.println("Burned " + gallonsBurned + " gallons. " + this.currentFuel + " Gallons remaining!" );
			this.range();
			
		}
		
		
	}
	
	public void refuel() {		//fully refuel tank
		
		this.currentFuel = this.maxFuel;
		System.out.println("Fuel refilled to max! " + this.currentFuel + " gallons remaining!");
		this.range();
		
	}
	
	public void refuel(int gallons) {	//refuel tank by specified amount
		
		if((gallons + this.currentFuel) > this.maxFuel) {
			
			System.out.println("Can't add more fuel than max fuel!");
			System.out.println();
			
		}
		
		else {
			
			this.currentFuel = this.currentFuel + gallons; 
			System.out.println("Successfully refueled " + gallons + " gallons! " + this.currentFuel + " gallons remaining!");
			this.range();
			
		}
		
		
	}
	
	
	
	
}
