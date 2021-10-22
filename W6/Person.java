package com.tugas;

public class Person {

	private String name;
	private Address address;
	private final Job job;
	
	Person (String name, Job job, Address address) {
		this.name = name;
		this.job = job;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Job getJob() {
		return job;
	}
	
	void disp() {
		double bonus = 2500000;
		Salary objSalary = new Salary();
		double salary = objSalary.getSalary() + bonus;
		System.out.println("My salary is around Rp." + salary);
	}
}
