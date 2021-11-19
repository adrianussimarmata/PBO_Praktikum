package com.StudiKasus2;

import java.util.*;

abstract public class SuperHero implements Comparable<SuperHero> {

	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	public SuperHero(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public void Identity() {
		
	}
	
	public void showPower() {
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + getName().toUpperCase());
		System.out.println("TIME TO SHOW YOU MY POWERS");
	}
	
	public int compareTo(SuperHero sh) {
		if(powerLevel == sh.powerLevel)
			return 0;
		else if(powerLevel > sh.powerLevel)
			return 1;
		else
			return -1;
	}
}
