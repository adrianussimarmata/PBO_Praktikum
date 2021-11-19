package com.StudiKasus2;

public class ManRay extends SuperHero{
	
	public ManRay(String name, int powerLevel) {
		super(name, powerLevel);
	}
	
	public int getPowerLevel() {
		return super.getPowerLevel();
	}
	
	public String getName() {
		return super.getName();
	}
	
	public void addPower(Power power) {
		super.addPower(power);
	}
	
	public void Identity() {
		System.out.println("It's " + super.getName() + ", the ManRay! It has the power level of " + super.getPowerLevel());
	}
	
	public void showPower() {
		super.showPower();
		Power obj = new LaserEye();
		obj.doPower();
		
		obj = new Strength();
		obj.doPower();
	}
}
