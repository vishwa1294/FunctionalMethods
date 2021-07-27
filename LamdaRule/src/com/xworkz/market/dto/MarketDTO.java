
package com.xworkz.market.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable {

	private String name;
	private String location;
	private String marketType;
	private int noOfShops;

	public MarketDTO() {

	}

	public MarketDTO(String name, String location, String marketType, int noOfShops) {
		super();
		this.name = name;
		this.location = location;
		this.marketType = marketType;
		this.noOfShops = noOfShops;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((marketType == null) ? 0 : marketType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfShops;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (marketType == null) {
			if (other.marketType != null)
				return false;
		} else if (!marketType.equals(other.marketType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfShops != other.noOfShops)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", marketType=" + marketType + ", noOfShops="
				+ noOfShops + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

}

