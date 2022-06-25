package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	// private scanner
	public Scanner userInput = new Scanner(System.in);
	// array for the classes to populate	
	private FoodTruck[] fleetOfFoodTrucksArr = new FoodTruck[5];
	
	
	public static void main(String[] args) {
		// Instantiate an instance of the FoodTruckApp and call the interface method
		FoodTruckApp app = new FoodTruckApp();
		app.foodTruckBuilder();
	}
	
	// method for taking in data from the user to build each truck with
	private void foodTruckBuilder() {
		
		System.out.println("Welcome to the Food Truck App where you can enter up to 5 food trucks and rate each one. You can then see a report of which truck rates the highest, see a comprehansive list of the Food Trucks or their average rating.\nYou may enter \"quit\" when prompted for a Food Truck name if you wish to enter less than 5 trucks.\n");
		// for-loop request user input for truck name, food type and rating (1-5)
		for (int i = 0; i < fleetOfFoodTrucksArr.length; i++) {
			// create a new truck object to build at every iteration	
			FoodTruck cT = new FoodTruck();
				
			
			/*sysout for input, list variable to be assigned, , assign input to correct index*/
			System.out.println("Please enter the name of Food Truck number " + (i + 1) + " or enter \"quit\" to advance to the menu.");		 
			String userInputTruckName = userInput.nextLine();
			if (userInputTruckName.equals("quit") || userInputTruckName.equals("Quit") || userInputTruckName.equals("QUIT") || userInputTruckName.equals("Q") || userInputTruckName.equals("q")) {
				//invoke menu method 
				menu();
			} else {
			// invoke FoodTruck set constructor
			cT.setName(userInputTruckName);
			}
			System.out.println("Please enter the type of food served by " + userInputTruckName + ".");
			String userInputFoodType = userInput.nextLine();
			// invoke FoodTruck set constructor
			cT.setType(userInputFoodType);
				
			System.out.println("On a scale of 1 to 5, 5 being excellent and 1 representing poor, how do you rate your " + userInputTruckName + " experience?");
			int userInputRating = userInput.nextInt();
			// clear the scanner
			userInput.nextLine();
			// invoke FoodTruck set constructor		
			cT.setRating(userInputRating);
		
			// add the completed truck into the array
			fleetOfFoodTrucksArr[i] = cT;
			System.out.println("Your entry has been added!\n");
			}
		// invoke the menu method (now all foodtrucks have been created)
		
		menu();
		}

	
	// method for the menu
	public void menu() {
		// present menu to user in invoke the proper method to fetch the correct data based on users selection (switch)
		System.out.println(fleetOfFoodTrucksArr[0]);
		System.out.println(fleetOfFoodTrucksArr[1]);
	System.exit(0);
	}
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
	

