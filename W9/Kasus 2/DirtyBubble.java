package com.StudiKasus2;

public class DirtyBubble extends SuperHero{

	public DirtyBubble(String name, int powerLevel) {
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
		System.out.println("It's " + super.getName() + ", the DirtyBubble! It has the power level of " + super.getPowerLevel());
	}
	
	public void showPower() {
		super.showPower();
		Power obj = new Strength();
		obj.doPower();
		
		obj = new Flying();
		obj.doPower();
	}
}
