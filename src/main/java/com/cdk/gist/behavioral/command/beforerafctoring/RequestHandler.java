package com.cdk.gist.behavioral.command.beforerafctoring;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestHandler {
	private static Map<String,Action> actions=new HashMap<>();
	static{
		
		actions.put("SONEJAO", new SONEJAOAction());
		actions.put("KHANAKHAO", new khanaoKhaoAction());
		actions.put("GoForBreakfast", new BreakFastAction());
	}
	private static final String ERROR="error";
	
	private static void takeAction(String action){
		 actions.get(action).execute();
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("Action:");
			String line=scanner.nextLine();
			if(line.equals("DONE"))
				break;
			takeAction(line);
		}
		System.out.println("Exit:");
	}
}
