package com.study.java.cheapestFights.Dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.study.java.cheapestFights.Model.City;
import com.study.java.cheapestFights.Model.TravelCost;

/**
 * Mock data for the testing Logic
 * 
 * @author sagar.badhe
 *
 */
public class TravelCostService {

	/**
	 * @return List of the all nodes(Values between two vertex)
	 */
	public List<TravelCost> getCitiesList() {

		City doha = new City("Doha");
		City delhi = new City("delhi");
		City mumbai = new City("Mumbai");
		City amsterdam = new City("Amsterdam");
		City nagpur = new City("Nagpur");

		List<TravelCost> Travelcostpercity = new ArrayList<>();
		Travelcostpercity.add(new TravelCost(100, amsterdam, doha, 0));
		Travelcostpercity.add(new TravelCost(150, amsterdam, mumbai, 0));
		Travelcostpercity.add(new TravelCost(100, amsterdam, delhi, 0));
		Travelcostpercity.add(new TravelCost(20, doha, nagpur, 0));
		Travelcostpercity.add(new TravelCost(10, doha, mumbai, 0));
		Travelcostpercity.add(new TravelCost(10, mumbai, nagpur, 0));
		Travelcostpercity.add(new TravelCost(25, delhi, nagpur, 0));
		Travelcostpercity.add(new TravelCost(3, delhi, mumbai, 0));

		return Travelcostpercity;
	}

	/**
	 * @param fromCity 
	 * @return Set for the TravelCost (Child nodes) 
	 */
	public Set<TravelCost> getAssociatedCitiesList(City fromCity) {

		List<TravelCost> travelCostFilter = this.getCitiesList().stream()
				.filter(travelCost -> (travelCost.getFromCity().getNameOfCity() == fromCity.getNameOfCity()))
				.collect(Collectors.toList());

		Set<TravelCost> TravelCostSet = new HashSet<>();
		travelCostFilter.forEach(travelCost -> TravelCostSet.add(travelCost));

		return TravelCostSet;
	}

}
