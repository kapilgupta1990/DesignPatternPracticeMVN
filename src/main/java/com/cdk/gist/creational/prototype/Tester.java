package com.cdk.gist.creational.prototype;

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person person1=new Employee("kapil", "suresh", "12", 100.0);
		System.out.println(person1);
		
		Person person2=(Person) person1.clone();
		System.out.println(person2);
	}
}
