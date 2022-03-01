package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {
	 

	int fa;
	private Scanner sc = new Scanner(System.in);
	private FoodTruck[] trucks;
	
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.newFoodTrucks();
		fta.newMenu();
	}
	public void newFoodTrucks() {
		FoodTruck[] trucks = new FoodTruck[5];
		String truckName;
		String foodType;
		int foodRating;
		int numId = 1;
		
		
		
		int [] truck = new int [fa];
		
		while ( fa <= 5) {
			System.out.println("How many trucks are we inputting today?: ");
			fa = sc.nextInt();

			System.out.println("Please enter the name of the first food truck: ");
			truckName = sc.next();
			
			System.out.println("Please enter the name of the second food truck: ");
			truckName = sc.nextLine();
			
			System.out.println("Please enter the name of the third food truck: ");
			truckName = sc.nextLine();
			
			System.out.println("Please enter the name of the fourth food truck: ");
			truckName = sc.nextLine();
			
			System.out.println("Please enter the name of the last food truck: ");
			truckName = sc.nextLine();
			
			
		

			if (fa >= 3 && truckName.equalsIgnoreCase("quit")) {
				break;

			} else if (fa < 3 && truckName.toLowerCase().contains("quit")) {
				System.out.println("You must have at least 3 trucks!");

			}

			System.out.println("\nWhat is the rating of the first truck? (Between 1 & 10)");
			foodRating = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\nWhat type of food does this truck have?");			
			foodType = sc.nextLine();

			

			trucks[fa] = new FoodTruck();
			
			fa++;

		}

		this.trucks = trucks;

	}
	
	
	
	
	
	
	
	public void newMenu() {

		System.out.println("=========================");
		System.out.println("\tMenu");
		System.out.println("|=========================|");
		System.out.println("|1) - List Trucks         |");
		System.out.println("|2) - Average Rating      |");
		System.out.println("|3) - Highest Rating      |");
		System.out.println("|4) - Quit                |");
		System.out.println("|_________________________|");
		System.out.print("choice: ");

	switch (sc.next()) {
	case "1":
		listTrucks();
		break;
	case "2":
		averageRating();
		break;
	case "3":
		highestRated();
		break;
	case "4":
		System.out.println("Thank you for using the Food Truck App!");
		System.exit(0);
	default:
		System.out.println("* Invalid choice, Try again.");
		break;
	}

	newMenu();
}

public void listTrucks() {
	System.out.println("You now have " + trucks.length + " trucks.");
	
	for (FoodTruck ft : trucks) {
		if (ft == null) {
			continue;
		} else {
			System.out.println(ft.toString());
		}
	}
}

public void averageRating() {
	int rateTracker = 0;
	double averageRating = 0;
	
	for (int i = 0; i < trucks.length; i++) {
		if (trucks[i] == null) {
			continue;
		} else {
			int rating = trucks[i].getRating();
			
			averageRating += rating;
			
			rateTracker++;
		}

	}
	double totalAverageRating = averageRating / rateTracker;
	System.out.println("The average rating of these trucks is: " + totalAverageRating);
}

public void highestRated() {
	int rating = 0;
	String highestTruck = "";
	
	for (int i = 0; i < trucks.length; i++) {
		if (trucks[i] == null) {
			continue;
		} else if (trucks[i].getRating() > rating) {
			rating = trucks[i].getRating();
			highestTruck = trucks[i].toString();
		}
	}
	
	System.out.println("The highest rated truck is: " + highestTruck);
}

}	















