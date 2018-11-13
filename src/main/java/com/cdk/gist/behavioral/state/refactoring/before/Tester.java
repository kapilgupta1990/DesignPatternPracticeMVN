package com.cdk.gist.behavioral.state.refactoring.before;


public class Tester {

	public static void main(String[] args) {

		Player player=new Player("Kapil");
		
		// If on pressed then make player is on
		// If off is pressed then player is shutdown
		// If standby is pressed then player is stand by
		
		player.setState(new OnState(player));
		player.setState(new OffState(player));
		
	}
}
