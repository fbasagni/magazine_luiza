package elementos;

import org.openqa.selenium.By;

public class Elementos {

      By procurar = By.xpath("//*[@id=\"inpHeaderSearch\"]");
      By botao = By.xpath("//*[@id=\"btnHeaderSearch\"]/i");
      By produto = By.xpath("//*[@id=\"product_ga6j1adbf6\"]/a[1]/h3");
      By adicionarSacola = By.xpath("/html/body/div[3]/div[5]/div[1]/div[4]/div[2]/button");
	public By getProcurar() {
		return procurar;
	}
	public void setProcurar(By procurar) {
		this.procurar = procurar;
	}
	public By getBotao() {
		return botao;
	}
	public void setBotao(By botao) {
		this.botao = botao;
	}
	public By getProduto() {
		return produto;
	}
	public void setProduto(By produto) {
		this.produto = produto;
	}
	public By getAdicionarSacola() {
		return adicionarSacola;
	}
	public void setAdicionarSacola(By adicionarSacola) {
		this.adicionarSacola = adicionarSacola;
	}
      

}
