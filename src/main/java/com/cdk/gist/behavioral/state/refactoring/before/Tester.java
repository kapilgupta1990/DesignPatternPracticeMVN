package com.cdk.gist.behavioral.state.refactoring.before;


public class Tester {

	public static void main(String[] args) {

		Player player=new Player();
		State state=new State(player);
		// If on pressed then make player is on
		// If off is pressed then player is shutdown
		// If standby is pressed then player is stand by
		
		state.setState("on");
		state.setState("off");
		state.setState("standby");
		state.setState("on");
		
	}
}
