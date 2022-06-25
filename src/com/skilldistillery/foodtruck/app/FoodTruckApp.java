package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	// private scanner
	public Scanner userInput = new Scanner(System.in);
	//2D array for the classes to populate	
	//private String [][] fleetOfFoodTrucksArr = foodTruckBuilder();
	
	public static void main(String[] args) {
		// Instantiate an instance of the FoodTruckApp and call the interface method
		FoodTruckApp app = new FoodTruckApp();
		app.foodTruckBuilder();
	}
	
	// method for taking in data from the user to build each truck with
	private void foodTruckBuilder() {
		// int to keep track of all the ratings given in the truck entries and to pass to the average calculating method
		int cumulativeScores = 0;
		// int for the final value of row (iteration)
		int counter = 0;
		System.out.println("Welcome to the Food Truck App where you can enter up to 5 food trucks and rate each one. You can then see a report of which truck rates the highest, see a comprehansive list of the Food Trucks or their average rating.\nYou may enter \"quit\" when prompted for a Food Truck name if you wish to enter less than 5 trucks.\n");
		// for-loop request user input for truck name, food type and rating (1-5)
		for (int row = 1; row < 6; row++) {
			// invoke a new instance of the FoodTruck class	
			FoodTruck foodTruck = new FoodTruck();
			
			// invoke the assign the truckID FoodTruck method and pass it the value of row
			
				/*sysout for input, list variable to be assigned, , assign input to correct index*/
				System.out.println("Please enter the name of Food Truck number " + row + " or enter \"quit\" to advance to the menu.");		 
				String userInputTruckName = userInput.next();				
				// invoke FoodTruck class method
				foodTruck.setName(userInputTruckName);
				
				System.out.println("Please enter the type of food served by " + userInputTruckName);
				String userInputFoodType = userInput.next();
				// invoke FoodTruck class method
				foodTruck.setType(userInputFoodType);
				
				System.out.println("On a scale of 1 to 5, 5 being excellent and 1 repreesnting poor, how do you rate your " + userInputTruckName + "?");
				int userInputRating = userInput.nextInt();
				cumulativeScores += userInputRating;
				// increment the counter variable
				counter++;
				// invoke FoodTruck class method			
				foodTruck.setRating(userInputRating);
			}
		// invoke the menu method (now all foodtrucks have been created)
		
		}

	
	// method for the menu
	
		// present menu to user in invoke the proper method to fetch the correct data based on users selection (switch)
	
	// method for sending inputs to the FoodTruck class and inputting them into a 2D array of trucks 
		//Declare a 2D String array instance with a 5 and 4 grid
//		String[][] userInputFoodTruckArr = new String[5][4];
//		userInputFoodTruckArr[row][1] = userInputTruckName;
//		userInputFoodTruckArr[row][2] = userInputFoodType;
//		userInputFoodTruckArr[row][3] = userInputRating;

	// method to compute the average rating of the trucks and return a String (use toString)
	//private int averageRating(int score) {
		// invoke the menu method
	
	}
	// method to  list the highest rated truck(s)
	
		// The truck(s) is displayed with all its properties (use toString)
	
		// invoke the menu method
	
	// method to generate a list of all trucks in the array (use toString)
	
		// invoke the menu method
	
	// method to send closing message, close the scanner & quit the program 
	

