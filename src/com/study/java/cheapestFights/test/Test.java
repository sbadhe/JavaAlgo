package com.study.java.cheapestFights.test;

import com.study.java.cheapestFights.CheapestFightsController;
import com.study.java.cheapestFights.Model.City;
import com.study.java.cheapestFights.Model.TravelCost;

public class Test {

	public static void main(String[] args) {

		CheapestFightsController test = new CheapestFightsController();
		TravelCost testCost = test.getCheapestPrice(new City("Amsterdam"), new City("Nagpur"), 2);
		System.out.println(" Prcie " + testCost.getPrice());
		System.out.println(" Stops " + testCost.getStops());
	}

}
