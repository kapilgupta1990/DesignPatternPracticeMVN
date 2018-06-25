package com.cdk.gist.behavioral.state.refactoring.after;

public class Player {
	private State state;

	public Player(State state) {
		super();
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void play() {
		state.pressPlay(this);
	}

}
