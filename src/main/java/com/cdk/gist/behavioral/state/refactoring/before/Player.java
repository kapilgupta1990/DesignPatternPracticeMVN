package com.cdk.gist.behavioral.state.refactoring.before;

public class Player {

	private String playerName;
	private State state;

	public Player(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setState(State state) {
		state.execute();

	}
}
