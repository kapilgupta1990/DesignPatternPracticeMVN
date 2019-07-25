package com.cdk.gist.behavioral.command;

public class OpenCommand implements Command{

	private WordDocument wordDocument;
	
	
	public OpenCommand(WordDocument wordDocument) {
		super();
		this.wordDocument = wordDocument;
	}


	@Override
	public void execute() {
		wordDocument.open();
		
	}

}
