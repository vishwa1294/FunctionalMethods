package com.xworkz.Habba.dto;

import java.io.Serializable;

import com.xworkz.Habba.constant.Religion;



public class HabbaDTO implements Serializable{
	

private String name;
private String region;
private int noOfDays;
private Religion religion;
private String specialFood;
private boolean shouldBath;
private boolean wakeupEarly;

public HabbaDTO() {
	super();
}

public HabbaDTO(String name, String region, int noOfDays, Religion religion, String specialFood, boolean shouldBath,
		boolean wakeupEarly) {
	super();
	this.name = name;
	this.region = region;
	this.noOfDays = noOfDays;
	this.religion = religion;
	this.specialFood = specialFood;
	this.shouldBath = shouldBath;
	this.wakeupEarly = wakeupEarly;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + noOfDays;
	result = prime * result + ((region == null) ? 0 : region.hashCode());
	result = prime * result + ((religion == null) ? 0 : religion.hashCode());
	result = prime * result + (shouldBath ? 1231 : 1237);
	result = prime * result + ((specialFood == null) ? 0 : specialFood.hashCode());
	result = prime * result + (wakeupEarly ? 1231 : 1237);
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
	HabbaDTO other = (HabbaDTO) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (noOfDays != other.noOfDays)
		return false;
	if (region == null) {
		if (other.region != null)
			return false;
	} else if (!region.equals(other.region))
		return false;
	if (religion != other.religion)
		return false;
	if (shouldBath != other.shouldBath)
		return false;
	if (specialFood == null) {
		if (other.specialFood != null)
			return false;
	} else if (!specialFood.equals(other.specialFood))
		return false;
	if (wakeupEarly != other.wakeupEarly)
		return false;
	return true;
}
@Override
public String toString() {
	return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", religion=" + religion
			+ ", specialFood=" + specialFood + ", shouldBath=" + shouldBath + ", wakeupEarly=" + wakeupEarly + "]";
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
}

public int getNoOfDays() {
	return noOfDays;
}

public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}

public Religion getReligion() {
	return religion;
}

public void setReligion(Religion religion) {
	this.religion = religion;
}

public String getSpecialFood() {
	return specialFood;
}

public void setSpecialFood(String specialFood) {
	this.specialFood = specialFood;
}

public boolean isShouldBath() {
	return shouldBath;
}

public void setShouldBath(boolean shouldBath) {
	this.shouldBath = shouldBath;
}

public boolean isWakeupEarly() {
	return wakeupEarly;
}

public void setWakeupEarly(boolean wakeupEarly) {
	this.wakeupEarly = wakeupEarly;
}




	
}
	

