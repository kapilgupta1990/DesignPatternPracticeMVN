package com.cdk.gist.behavioral.command;

public class SaveCommand implements Command{

	private WordDocument wordDocument;
	
	
	public SaveCommand(WordDocument wordDocument) {
		super();
		this.wordDocument = wordDocument;
	}
	@Override
	public void execute() {
		wordDocument.save();
	}

}
