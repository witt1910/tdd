package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import model.entities.Product;

public class ProductTest {

	// 01.01 Aplicação simples com JUnit
	
	@Test
	public void testeInstanciacaoProduct() {
		Product p1 = new Product("TV", 1000.00);

		Assert.assertEquals("TV", p1.getName());
		// Assert.assertEquals(1000.0, p1.getPrice());

	}
}
