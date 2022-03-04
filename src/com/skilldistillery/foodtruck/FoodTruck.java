package com.skilldistillery.foodtruck;

public class FoodTruck {
private static int numID = 0;
private int counter;
private String truckName;
private String foodType;
int foodRating;


	   public int getCounter() {
		return getCounter();
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getTruckName() {
		return getTruckName();
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return getFoodType();
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckRating() {
		return getTruckRating();
	}

	public void setFoodRating(int foodRating) {
		this.foodRating = foodRating;
	}

	public int getNumID() {
		return numID;
	}

	public void setID(int iD) {
		this.numID = getNumID();
		counter++;
	}

	public FoodTruck[] getTrucks() {
		return getTrucks();
	}

	

	public FoodTruck(String truckName, String foodType, int truckRating, FoodTruck[] ftArray) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.foodRating = truckRating;
		this.numID = counter;
	}

	

	public FoodTruck(String truckName2, String typeOfFood, double foodRating2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", foodRating=" + foodRating + ", ID="
				+ numID;
	



}}

	