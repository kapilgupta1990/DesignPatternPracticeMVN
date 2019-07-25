package com.cdk.gist.behavioral.command;

public class CloseCommand implements Command {

	private WordDocument wordDocument;

	public CloseCommand(WordDocument wordDocument) {
		super();
		this.wordDocument = wordDocument;
	}

	@Override
	public void execute() {
		wordDocument.close();

	}

}
