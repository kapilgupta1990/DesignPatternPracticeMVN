package com.cdk.gist.creational.singleton;

public enum DBConn1 {

	INSTANCE;
	
	public static DBConn1  getInstance(){
		return DBConn1.INSTANCE;
		
	}
}
