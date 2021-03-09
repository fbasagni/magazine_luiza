package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
	  metodos.abrirNavegador(string, string);
	}

	@When("pesquisar o nome do produto {string}")
	public void pesquisar_o_nome_do_produto(String string) {
	   
	 metodos.
	}

	@Then("validar produto inserido na sacola")
	public void validar_produto_inserido_na_sacola() {
       metodos.fecharNavegador("encerrando o teste");
	}

}
