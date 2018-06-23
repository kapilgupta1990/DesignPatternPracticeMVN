package com.cdk.gist.behavioral.observer;

public class AverageScoreDisplay implements Observer {

	@Override
	public void notify(int score) {
		System.out.println("Average score " + score);
	}

}
