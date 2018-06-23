package com.cdk.gist.behavioral.observer;

public class CurrentScoreDisplay implements Observer {

	@Override
	public void notify(int score) {
		System.out.println("Current score " + score);

	}
}
