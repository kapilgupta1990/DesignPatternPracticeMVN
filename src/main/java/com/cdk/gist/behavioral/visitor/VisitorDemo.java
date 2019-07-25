package com.cdk.gist.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorDemo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Shirt("ABC", "20", 200));
		products.add(new Shirt("ABC", "20", 300));
		products.add(new DVD("DVD-1", 600));
		ShoppingMallVisitorImpl mallVisitor = new ShoppingMallVisitorImpl();
		calculateTotalCost(products, mallVisitor);
		System.out.println(mallVisitor.getTotalPrice());

	}

	private static void calculateTotalCost(List<Product> products, ShoppingMallVisitor mallVisitor) {
		for (Product product : products) {
			product.accept(mallVisitor);
		}

	}
}
