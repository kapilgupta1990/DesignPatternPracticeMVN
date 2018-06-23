package com.cdk.gist.strectural.composite;

public class Tester {

	public static void main(String[] args) {
			
		Employee kapil=new Developer("kapil",24.5);
		Employee salil=new Developer("salil",24.5);
		Employee Manager1=new Manager("Atul",24.5);
		Manager1.addEmployee(kapil);
		Manager1.addEmployee(salil);
		
		Employee Nishant=new Developer("Nishant",24.5);
		Employee Gaurab=new Developer("Gaurab",24.5);
		Employee Manager2=new Manager("Atul k",24.5);
		Manager2.addEmployee(Nishant);
		Manager2.addEmployee(Gaurab);
		
		Employee Abhishek=new Manager("Abhishek",405);
		Abhishek.addEmployee(Manager1);
		Abhishek.addEmployee(Manager2);
		
		Employee.printEmployee(Manager2);
		
		
		
		
	}
}
