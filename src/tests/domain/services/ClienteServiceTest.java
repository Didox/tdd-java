package tests.domain.services;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import domain.entidades.*;
import domain.services.*;


class ClienteServiceMock implements IClienteService{

	@Override
	public void salvar(Cliente cliente) {
	}
	
}

public class ClienteServiceTest {
	@Test
	void usandoClienteService() {
		var cliente = new Cliente();
		cliente.setId(1);
		
		new ClienteServiceMock().salvar(cliente);
		assertEquals(cliente.getId(), 1);
	}
}
