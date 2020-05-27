package model.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {

	// 01.01 Aplicação simples com JUnit

	@Test
	public void testeInstanciacaoProduct() {
		Product p1 = new Product("TV", 1000.0);

		assertEquals("TV", p1.getName());
		assertEquals(1000, p1.getPrice(), 0.001);

	}
}
