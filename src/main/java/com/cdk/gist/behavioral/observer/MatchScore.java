package com.cdk.gist.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MatchScore {

	int score;
	private List<Observer> observers;

	public MatchScore() {
		observers=new ArrayList<>();
		registerObserver();
	}
	public void setScore(int score) {

		this.score = score;
		notifyAllScoreBoard();
	}

	private void registerObserver() {

		observers.add(new AverageScoreDisplay());
		observers.add(new CurrentScoreDisplay());

	}

	public void notifyAllScoreBoard() {
		for (Observer notifier : observers) {
			notifier.notify(score);
		}
	}
}
