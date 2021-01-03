package com.study.java.cheapestFights;

import java.util.PriorityQueue;
import java.util.Set;

import com.study.java.cheapestFights.Dao.TravelCostService;
import com.study.java.cheapestFights.Model.City;
import com.study.java.cheapestFights.Model.TravelCost;

/**
 * Control the fight prices
 * 
 * @author sagar.badhe
 * @version 1.0
 * 
 */
public class CheapestFightsController {

	public TravelCost getCheapestPrice(City fromCity, City toCity, int numberOfStops) {

		PriorityQueue<TravelCost> travelCostQueue = new PriorityQueue<TravelCost>(
				(a, b) -> a.getPrice() - b.getPrice());

		travelCostQueue.add(new TravelCost(0, fromCity, fromCity, -1));

		while (!travelCostQueue.isEmpty()) {

			TravelCost travelCostCurrent = travelCostQueue.poll();
			if (travelCostCurrent.getToCity().getNameOfCity().equals(toCity.getNameOfCity())) {
				return travelCostCurrent;
			}

			if (travelCostCurrent.getStops() < numberOfStops) {

				TravelCostService travelCostService = new TravelCostService();

				Set<TravelCost> citiesAssociated = travelCostService.getAssociatedCitiesList(travelCostCurrent.getToCity());

				citiesAssociated.forEach((nextStop) -> {

					travelCostQueue.add(new TravelCost((travelCostCurrent.getPrice() + nextStop.getPrice()),
							nextStop.getFromCity(), nextStop.getToCity(), travelCostCurrent.getStops() + 1));

				});
			}
		}
		return null;
	}
}
