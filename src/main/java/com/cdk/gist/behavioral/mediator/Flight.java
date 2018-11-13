package com.cdk.gist.behavioral.mediator;

public class Flight implements Command {

	private ATCMediator actMediator;

	public Flight(ATCMediator atcMediator) {
		this.actMediator = atcMediator;
	}

	@Override
	public void land() {
		if (actMediator.isLandingOk()) {
			System.out.println("Successfully Landed");
			actMediator.setLandingStatus(true);
		} else {
			System.out.println("Waiting for landing");
		}

	}

	public void getReady() {
		System.out.println("Ready for landing.");
	}

}
