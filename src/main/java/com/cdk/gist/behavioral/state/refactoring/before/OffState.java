package com.cdk.gist.behavioral.state.refactoring.before;

public class OffState extends State {

	public OffState(Player player) {
		super(player);
	}

	@Override
	public void execute() {
		stopplaying();
	}

	private void stopplaying() {
		System.out.println(player.getPlayerName() + " has stopped playing...");
	}

}
