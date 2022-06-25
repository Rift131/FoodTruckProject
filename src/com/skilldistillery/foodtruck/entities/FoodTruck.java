package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
/*fields assigned values based on the users input from the FoodTruckApp userInterface method
 * 1. ID number (set to current value of i + 1)
 * 2. name
 * 3. type
 * 4. rating
 *  */
	private int idNum;
	private String name;
	private String type;
	private int rating;
	// empty constructor for the FoodTruck class (this class)
	public FoodTruck() {};
	// overload the constructor above but with parameters entered for the fields listed
	public FoodTruck(int ftIdNum, String ftName, String ftType, int score) {
		//this.fieldName = corresponding parameter name for each field
		this.idNum = ftIdNum;
		this.name = ftName;
		this.type = ftType;
		this.rating = score;
	}
	// constructor that assigns the ID number value from the current value of a static field (such as (nextTruckId) and then increments the static field.
	
	// method for invoking the menu method if the truckname is "quit"
	
	// rating method
		//String userInputRatingString = String.valueOf(userInputRating).toString();
	// GETTERS AND SETTERS

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

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
		return "FoodTruck [idNum=" + idNum + ", name=" + name + ", type=" + type + ", rating=" + rating + "]";
	}
	
	
	
	
}
