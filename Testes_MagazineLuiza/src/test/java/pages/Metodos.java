package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	public void abrirNavegador(String appUrl, String descricaoPasso) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(appUrl);

	}
    
	public void procurar(String nome, By elemento) {
		driver.findElement(elemento).sendKeys("Ventilador");
		
	}
	   
	
	public void fecharNavegador (String descrisaoPasso) {
		
		driver.quit();
		
	}
	
	public void submit (By elemento) {
		driver.findElement(elemento).submit();
		
	}
}
