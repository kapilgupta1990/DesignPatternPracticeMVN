package com.cdk.gist.behavioral.command;

/*
 * Invoker
 */
public class MenuOptions {

	private Command openCommand;
	private Command closeCommand;
	private Command saveCommand;

	public MenuOptions(Command openCommand, Command closeCommand, Command saveCommand) {
		super();
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.saveCommand = saveCommand;
	}

	public void clickOpen() {
		openCommand.execute();
	}

	public void clickSave() {
		saveCommand.execute();
	}

	public void clickClose() {
		closeCommand.execute();
	}

}
