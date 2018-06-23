package com.cdk.gist.creational.builder;

public class Cake {

	private final double sugar;
	private final double butter;
	private final double eggs;

	private Cake(CakeBuilder cakeBuilder){
		this.sugar=cakeBuilder.sugar;
		this.butter=cakeBuilder.butter;
		this.eggs=cakeBuilder.eggs;
	}
	
	
	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + "]";
	}


	public static CakeBuilder cakeBuilder() {
		return new CakeBuilder();
	}

	public static class CakeBuilder {
		private double sugar;
		private double butter;
		private double eggs;

		public CakeBuilder addSugar(double sugar) {
			this.sugar=sugar;
			return this;
		}

		public CakeBuilder addButter(double butter) {
			this.butter=butter;
			return this;
		}

		public CakeBuilder addEggs(double eggs) {
			this.eggs=eggs;
			return this;
		}
		public Cake build(){
			Cake cake=new Cake(this);
			return cake;
		}
	}

}
