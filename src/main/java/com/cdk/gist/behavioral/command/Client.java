package com.cdk.gist.behavioral.command;

public class Client {

	public static void main(String[] args) {
		WordDocument wordDocument=new WordDocument();
		OpenCommand openCommand=new OpenCommand(wordDocument);
		CloseCommand closeCommand=new CloseCommand(wordDocument);
		SaveCommand saveCommand=new SaveCommand(wordDocument);
		
		
		MenuOptions menuOPtions=new MenuOptions(openCommand, closeCommand, saveCommand);
		menuOPtions.clickOpen();
		menuOPtions.clickSave();
		menuOPtions.clickClose();
	}
}
