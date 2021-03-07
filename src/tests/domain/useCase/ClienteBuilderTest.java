package tests.domain.useCase;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import domain.useCase.ClienteBuilder;

public class ClienteBuilderTest {
	
	@Test
	void clienteBuilder() {
		new ClienteBuilder("Danilo");
		Assert.assertEquals(0, 0);
	}
}
