package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class DespegarHomePage  { 
	 @FindBy(css = "div.header-products-container>ul>li>a[title='Alojamientos']")
	 WebElement BtonAlojamientos;
	 @FindBy (xpath="//div[@class='sbox-places-destination--1xd0k']//div[@class='input-container']//input[@class='input-tag']")
	 WebElement IngresarDestino;
	 @FindBy (xpath="//div[@class='ac-container']//div[@class='ac-group-container'][1]//ul[@class='ac-group-items']//span[@class='item-text']")
	 WebElement Lista;
	 @FindBy(xpath="//input[@placeholder='Entrada']")
	 WebElement SeleccionFecha;
	 @FindBy(xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-container ']//div [@class='sbox5-monthgrid sbox5-compact-view']//div[@class='sbox5-monthgrid-datenumber -weekday']")
	 WebElement SeleccionarFechaEntrada;
	 @FindBy (xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-container ']//div [@class='sbox5-monthgrid sbox5-compact-view']//div[@class='sbox5-monthgrid-datenumber -weekday']")
	 WebElement SeleccionarFechaSalida;
	 @FindBy(xpath= "//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-footer-cta-container']/button[@class='sbox5-3-btn -primary -md']")
	 WebElement btonAplicar;
	 @FindBy(xpath="//div[@class='sbox5-distributionPassengers sbox5-box-distributionPassengers-ovr']")
	 WebElement SeleccionarHabitacion;
	 @FindBy(xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='sbox5-3-steppers -md']/button[@class='steppers-icon-right stepper__icon']")
	 public List<WebElement> Adulto;
	 @FindBy (xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='sbox5-3-steppers -md']/button[@class='steppers-icon-right stepper__icon']")
	 public List<WebElement> Menores;
	 @FindBy (xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='select__row__options__container']//div[@class='select-container']//option[@value='14']")
     WebElement EdadMenor;
	 @FindBy (xpath="//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__footer ']/a[@class='sbox5-3-btn -md -primary']")
	 WebElement SeleccionAplica;
	 @FindBy(xpath="//button[@class='sbox5-box-button-ovr sbox5-3-btn -secondary -icon -lg']")
	 WebElement Buscar;
	 @FindBy (xpath="//div[@class='header-products-container']//a[@class='shifu-3-button-circle FLIGHTS paint-circle ']")
	 WebElement UltimaValidacion;
	 
	 
	  WebDriver driver =null;
	  WebDriverWait wait = null;
	  
	public  DespegarHomePage (WebDriver driver)  { 
			this.driver = driver;
			PageFactory.initElements(driver, this);
	        this.wait= new WebDriverWait(driver, 10);
		}
	
	 public void ClickBoton () { 
		   wait.until(ExpectedConditions.visibilityOf(BtonAlojamientos));  
		   wait.until(ExpectedConditions.elementToBeClickable(BtonAlojamientos));
	       this.BtonAlojamientos.click();
		
	 }  
	 
	 public void ClicIngresarDestino() {
		 this.IngresarDestino.click();
	 } 
	public void IngresarDestino (String text) {
	       this.IngresarDestino.sendKeys(text);
		   IngresarDestino.sendKeys(Keys.CONTROL);
		   IngresarDestino.sendKeys(Keys.ENTER);
 
	 }  	
 	 public void ClickLista() {
 		 wait.until(ExpectedConditions.visibilityOf(Lista));  
 	     wait.until(ExpectedConditions.elementToBeClickable(Lista));
 		 this.Lista.click(); 
 	 }
 	 public void SeleccionarFecha (){
 		wait.until(ExpectedConditions.elementToBeClickable(SeleccionFecha));
 		 this.SeleccionFecha.isDisplayed();
 		 this.SeleccionFecha.click();
 	 }
 	 public void SeleccionarfechaEntrada() {
 		wait.until(ExpectedConditions.elementToBeClickable(SeleccionarFechaEntrada));
 		 this.SeleccionarFechaEntrada.isDisplayed();
 		 this.SeleccionarFechaEntrada.click(); 
 	 }
 	 public void SeleccionarfechaSalida() {
 		wait.until(ExpectedConditions.elementToBeClickable(SeleccionarFechaSalida));
 		 this.SeleccionarFechaSalida.isDisplayed();
 		WebElement Cookies = driver.findElement(By.xpath("//a[@class='lgpd-banner--button eva-3-btn -white -md']"));
 		Cookies.click();
 		 this.SeleccionarFechaSalida.click(); 
 	 }
 	 public void Aplicar() {
 		wait.until(ExpectedConditions.elementToBeClickable(btonAplicar));
 		 this.btonAplicar.isDisplayed();
 		 this.btonAplicar.click(); 
 	 }
 	
 	 public void seleccionarHabitacion() {
 		 this.SeleccionarHabitacion.click();
 	 }
 	public void Adultos() {
    	WebElement masAdulto =this.Adulto.get(0);
		wait.until(ExpectedConditions.elementToBeClickable(masAdulto));
		masAdulto.click();
	}
 	
 	 public void Menor() {
 		WebElement masMenor =this.Menores.get(1);
		wait.until(ExpectedConditions.elementToBeClickable(masMenor));
		masMenor.click();
	 }
 	 public void EdadMenores() {
 		
		wait.until(ExpectedConditions.elementToBeClickable(EdadMenor));
		this.EdadMenor.click();
	 }
 	public void SeleccionAplicar() {
 		wait.until(ExpectedConditions.elementToBeClickable(SeleccionAplica));
		 this.SeleccionAplica.click(); 
 	}
 	public void buscar() {
 		wait.until(ExpectedConditions.elementToBeClickable(Buscar));
        this.Buscar.click();
 	}
 	 public DespegarResultsPage validar() {
 		   return new DespegarResultsPage(this.driver);	   
 	   }
 
}





