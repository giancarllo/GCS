package testes;

import org.junit.Assert;
import org.junit.Test;

import entidades.Pessoa;

public class PessoasTest {


	@Test
	public void criarPessoa() {
		Pessoa test = new Pessoa("Ahmed Angel", 24);
		Assert.assertEquals("Ahmed Angel", test.getNome());
		Assert.assertEquals(24, test.getIdade());
	}
	
	@Test
	public void MudarNome(){
		Pessoa test = new Pessoa("Ahmed Angel", 24);
		test.setNome("Sora");
		Assert.assertNotEquals("Ahmed Angel", test.getNome());
		Assert.assertEquals("Sora", test.getNome());
	}

}
