package com.study.java.cheapestFights.Model;

/**
 * POJO for the Travel cost
 * 
 * @author sagar.badhe
 *
 */
public class TravelCost {

	private int price;
	private City fromCity;
	private City toCity;
	private int stops;

	
	public TravelCost(int price, City fromCity, City toCity, int stops) {
		super();
		this.price = price;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.stops = stops;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public City getFromCity() {
		return fromCity;
	}

	public void setFromCity(City fromCity) {
		this.fromCity = fromCity;
	}

	public City getToCity() {
		return toCity;
	}

	public void setToCity(City toCity) {
		this.toCity = toCity;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

}
