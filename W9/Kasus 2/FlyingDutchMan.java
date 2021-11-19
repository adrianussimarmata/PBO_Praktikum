package com.StudiKasus2;

public class FlyingDutchMan extends SuperHero{

	public FlyingDutchMan(String name, int powerLevel) {
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
		System.out.println("It's " + super.getName() + ", the FlyingDutchMan! It has the power level of " + super.getPowerLevel());
	}
	
	public void showPower() {
		super.showPower();
		Power obj = new Flying();
		obj.doPower();
		
		obj = new LaserEye();
		obj.doPower();
	}
}
