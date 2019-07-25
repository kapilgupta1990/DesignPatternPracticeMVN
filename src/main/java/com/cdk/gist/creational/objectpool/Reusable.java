package com.cdk.gist.creational.objectpool;

public class Reusable {

	private boolean isClosed=false;

	public void close() {
		isClosed = true;
		System.out.println("Closing the reusable object");
	}

	public boolean isClosed() {
		return isClosed;
	}

}
