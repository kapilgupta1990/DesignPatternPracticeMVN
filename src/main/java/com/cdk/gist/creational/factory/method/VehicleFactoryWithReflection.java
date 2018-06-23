package com.cdk.gist.creational.factory.method;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

public class VehicleFactoryWithReflection {

	public static void main(String[] args) throws IOException {

		System.out.println("Kapil");
		//Vehicle.class.
		ClassLoader cl=Thread.currentThread().getContextClassLoader();
		Enumeration<URL> url=cl.getResources("com/cdk/gist/");
		while(url.hasMoreElements()){
			System.out.println(url.nextElement());
		}
		Class c =Car.class.getClass();
		Class  interfaces=c.getSuperclass();
		//c.
		System.out.println(interfaces);
	}
}
