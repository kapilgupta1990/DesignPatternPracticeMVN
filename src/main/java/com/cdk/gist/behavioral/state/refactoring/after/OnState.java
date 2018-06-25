package com.cdk.gist.behavioral.state.refactoring.after;

public class OnState implements State{
	

	public void play(){
		System.out.println("Play");
	}

	@Override
	public void pressPlay(com.cdk.gist.behavioral.state.refactoring.after.Player context) {
		context.setState(new OnState());
		
	}
}
