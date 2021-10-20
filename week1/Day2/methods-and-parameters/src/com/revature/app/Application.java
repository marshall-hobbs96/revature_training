package com.revature.app;
import com.revature.model.*;

public class Application {

	public static void main(String[] args) {
		
		Car myCar = new Car("Toyota", "RAV4", 2015, 15, 25, 10.0);
		
		myCar.range();
		myCar.drive(100);
		myCar.refuel();
		myCar.refuel(100);
		myCar.drive(550);

	
	}

}
