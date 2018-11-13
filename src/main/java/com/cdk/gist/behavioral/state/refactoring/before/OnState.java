package com.cdk.gist.behavioral.state.refactoring.before;

public class OnState extends State {

	public OnState(Player player) {
		super(player);
	}

	@Override
	public void execute() {
		play();
	}

	private void play() {
		System.out.println(player.getPlayerName() + " Playing...");
	}
}
