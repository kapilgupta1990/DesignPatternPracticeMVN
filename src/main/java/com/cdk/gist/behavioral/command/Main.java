package com.cdk.gist.behavioral.command;

public class Main {
	public static void main(String[] args) {
			
		Light light=new Light();
		Switch lightSwitch=new Switch();
		Command onCommand=new onCommand(light);
		
		/*
		 * if(swich is on)
		 *    make Light on
		 *  if(switch is off)
		 *  Make light off  
		 * 
		 */
	}
}
