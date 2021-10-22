package com.tugas;

public class Main {

	public static void main(String[] args) {
		
		Organization objOrg = new Organization("Komunitas Cinta Alam");
		Job objJob = new Job("Programmer", "PT. Surya Medika");
		Address objAdr = new Address("Jl.Sekemirung Kaler No.13", "Bandung");
		Person objPerson = new Person("Otong", objJob, objAdr);
		
		System.out.println("My name is " + objPerson.getName());
		System.out.println("I'm member of " + objOrg.getOrganizationName());
		System.out.println("I live in " + objPerson.getAddress());
		System.out.println("I work as " + objPerson.getJob());
		objPerson.disp();
	}
}
