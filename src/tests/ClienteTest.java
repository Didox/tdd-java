package tests;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import domain.entidades.Cliente;

class ClienteTest {

	@Test
	void test() {
		var cliente = new Cliente();
		cliente.setNome("Danilo");
		
		Assert.assertEquals(cliente.getNome(), "Danilo");
	}

}
