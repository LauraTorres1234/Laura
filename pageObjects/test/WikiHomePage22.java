package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage22  { 
	
	
	@FindBy(id="Bienvenidos_a_Wikipedia,")
	WebElement titulo1;
	@FindBy (xpath="//div[@class='main-footer-actions main-plainlist nomobile']/ul/li[1]")
	WebElement Leer;

	private WebDriver driver =null;
	
	public WikiHomePage22 (WebDriver driver)  { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean tituloEsVisible2() { 
		return this.titulo1.isDisplayed();
		
	}

	public boolean botonLeerIsVisible() { 
		return this.Leer.isDisplayed();	
	}
	
   public WikiResultsPage22 botonLeer() {
	   this.Leer.click();
	   return new WikiResultsPage22 (this.driver);
			   
   }
}



  

