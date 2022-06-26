package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
/*fields assigned values based on the users input from the FoodTruckApp userInterface method
 * 1. ID number (set to current value of i + 1)
 * 2. name
 * 3. type
 * 4. rating
 *  */
	public static int COUNT = 0;
	private int idNum;
	private String name;
	private String type ;
	private int rating;	
	/***********************CONSTRUCTORS*************************/
	// initial constructor for the FoodTruck class and any attributes that won't be included when the user creates each truck
	public FoodTruck() {
		FoodTruck.COUNT++;
		this.idNum = COUNT;
	}
	
	// overload the constructor above but with parameters entered for the fields listed
	public FoodTruck(String ftName, String ftType, int score) {
		//everything you need to have happen for each truck that's made
		//this.fieldName = corresponding parameter name for each field
		this.name = ftName;
		this.type = ftType;
		this.rating = score;		
	}

	/***********************GETTERS AND SETTERS*************************/


//	public int getIdNum() {
//		return idNum;
//	}
//
//	public void setIdNum(int idNum) {
//		this.idNum = idNum;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
// to string method
	@Override
	public String toString() {
		return "Truck ID Number: " + idNum + "| FoodTruck name: " + name + "| Type: " + type + "| Rating: " + rating;
	}
	
	
	
	
}
