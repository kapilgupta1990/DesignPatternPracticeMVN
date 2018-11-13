package com.cdk.gist.behavioral.state.refactoring.before;

public abstract class State {

	protected Player player;

	public State(Player player) {
		this.player = player;
	}

	abstract protected void execute();

}
