package infra;

import domain.entidades.Cliente;

public class Executor {

	public static void main(String[] args) {
		var cliente = new Cliente();
		cliente.setNome("Danilo");
		System.out.println("vaiiii - " + cliente.getNome());

	}

}
