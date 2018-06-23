package com.cdk.gist.behavioral.observer;

public interface Observer {

	// CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
	// AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();

	public void notify(int score);
}
