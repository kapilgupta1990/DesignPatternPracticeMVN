package com.cdk.gist.behavioral.momento;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String behaviour;

	private List<Person.Momento> previousVersion=new ArrayList<>(); 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", behaviour=").append(behaviour).append("]");
		return builder.toString();
	}

	public void saveToMomento() {

		previousVersion.add(new Momento(this.behaviour));
	}

	public Momento getOldVersion(int index) {
		return previousVersion.get(index);

	}
	public static class Momento{
		private final String behaviour;

		public Momento(String behaviour) {
			super();
			this.behaviour = behaviour;
		}

		public String getBehaviour() {
			return behaviour;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Momento [behaviour=").append(behaviour).append("]");
			return builder.toString();
		}
		
	}
}
