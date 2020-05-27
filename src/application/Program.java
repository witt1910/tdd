package application;

import java.util.Locale;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Product p1 = new Product("TV", 100.00);

		System.out.println("Product: " + p1.getName());
		System.out.println("Price: " + p1.getPrice());
	}

}
