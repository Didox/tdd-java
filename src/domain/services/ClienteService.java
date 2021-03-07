package domain.services;

import domain.entidades.Cliente;

public class ClienteService implements IClienteService {
	public void salvar(Cliente cliente) {
		System.out.println("Vaiii " + cliente.getNome());
	}
}
