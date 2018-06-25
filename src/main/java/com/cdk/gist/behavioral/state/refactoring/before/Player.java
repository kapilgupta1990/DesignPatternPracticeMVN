package com.cdk.gist.behavioral.state.refactoring.before;

public class Player {

	public void toggle(State state){
		
		if(state.getState().equals("on")){
			play();
		}
		if(state.getState().equals("off")){
			stop();
		}
		if(state.getState().equals("standby")){
			standby();
		}
	}
	private void play(){
		System.out.println("Play");
	}
	private void stop(){
		System.out.println("stop");
	}
	private void standby(){
		System.out.println("stand by");
	}
}
