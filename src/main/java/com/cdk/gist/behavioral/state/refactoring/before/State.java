package com.cdk.gist.behavioral.state.refactoring.before;

public class State {

	private Player player;
	private String state;

	public State(Player player) {
		super();
		this.player = player;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		player.toggle(this);
	}
	
}
