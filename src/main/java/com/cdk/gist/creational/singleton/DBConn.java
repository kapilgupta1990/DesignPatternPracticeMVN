package com.cdk.gist.creational.singleton;

public class DBConn {

	private static DBConn connection = null;

	private DBConn() {

	}

	public static DBConn getInstance(){
		if(connection==null){
			synchronized (DBConn.class) {
				if(connection==null){
					connection=new DBConn();
				}
				
			}
		}
		return connection;
	}
}
