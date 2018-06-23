package com.cdk.gist.behavioral.momento;

public class Tester {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Kapil");
		person.setBehaviour("Hard working");
		
		person.saveToMomento();
		
		
		
		person.setBehaviour("Kamchor");
		person.saveToMomento();
		
		person.setBehaviour("kam Kamchor");
		person.saveToMomento();
		
		System.out.println(person.getOldVersion(1));
		
		
	
		
		
	}
}
