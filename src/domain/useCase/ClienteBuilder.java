package domain.useCase;

import domain.entidades.Cliente;
import domain.services.ClienteService;

public class ClienteBuilder {
	public ClienteBuilder(String nome) {
		var cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome(nome);
		
		new ClienteService().salvar(cliente);
	}
}
