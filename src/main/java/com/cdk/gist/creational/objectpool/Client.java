package com.cdk.gist.creational.objectpool;

public class Client {
	
	public static void main(String[] args) {
		ReusablePool reusablePool=new ReusablePool();
		
		
		Reusable reusable1=reusablePool.acquireReusable();
		Reusable reusable2=reusablePool.acquireReusable();
		
		System.out.println(reusable1);
		System.out.println(reusable2);
		
		
		reusablePool.releaseReusable(reusable2);
		
		Reusable reusable3=reusablePool.acquireReusable();
		System.out.println(reusable3);
		
	}

}
