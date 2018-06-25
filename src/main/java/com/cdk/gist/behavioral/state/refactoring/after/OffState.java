package com.cdk.gist.behavioral.state.refactoring.after;

import com.cdk.gist.behavioral.state.refactoring.before.Player;


public class OffState implements State{


	public void stop(){
		System.out.println("stop");
	}

	@Override
	public void pressPlay(com.cdk.gist.behavioral.state.refactoring.after.Player context) {
		context.setState(new OnState());
		
	}
}
