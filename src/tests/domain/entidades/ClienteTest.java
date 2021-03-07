package tests.domain.entidades;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import domain.entidades.Cliente;

class ClienteTest {

	@Test
	void validarInstanciaCliente() {
		var cliente = new Cliente();
		cliente.setNome("Danilo");
		cliente.setId(1);
		
		Assert.assertEquals(cliente.getNome(), "Danilo");
		Assert.assertEquals(cliente.getId(), 1);
	}

}
