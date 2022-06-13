package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DespegarResultsPage { 
	
	@FindBy (xpath="//div[@class='header-products-container']//a[@class='shifu-3-button-circle FLIGHTS paint-circle ']")
	 WebElement UltimaValidacion;
	
    private WebDriver driver =null;
	
	public DespegarResultsPage (WebDriver driver)  { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean tituloEsVisible() { 
		return this.UltimaValidacion.isDisplayed();
	}
}
