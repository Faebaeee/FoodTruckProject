package com.skilldistillery.foodtruck;

public class FoodTruck {
FoodTruck(){
	
}

	private static int counterId = 0;
	private int numId;
	private String truckName;
	private String foodType;
	private int foodRating;
	
   
	 public FoodTruck(String name, String type, int rating) {
		this.truckName = name;
		this.foodType = type;
		this.foodRating = rating;
		counterId = counterId++;
	}

	public String gettruckName() {
		return truckName;
	}

	public void setName(String name, String truckName) {
		this.truckName = truckName;
	}
	public String getType() {
		return foodType;
	}

	public void setType(String type) {
		this.foodType = type;
	}

	public int getRating() {
		return foodRating;
	}

	public void setRating(int rating) {
		this.foodRating = rating;
	}
	
	public int getNumId() {
		return numId;
	}
	
	public void setNumId(int numId) {
		this.numId = numId;
	}


	public void displayFoodTruck() {
	}

	public String toString() {
		String output = "name=" + truckName + ", type=" + foodType + ", rating=" + foodRating;
		return output;
	}
	
}
