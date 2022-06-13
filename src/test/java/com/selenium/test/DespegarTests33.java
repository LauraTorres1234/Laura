package com.selenium.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import test.DespegarHomePage;
import test.DespegarResultsPage;


public class DespegarTests33 extends DriverFactory {

private static WebDriver driver;
@BeforeMethod
public void setup() {
	driver = LevantarBrowser(driver,"FIREFOX","https://www.despegar.com.ar/");
}
	@DataProvider(name="ciudades")
	public Object[][] dpMethod() {
		return new Object [][] {{"san rafael, mendoza"},{"Mar del Plata"}, {"San Salvador de jujuy"}};
	}

@Test(groups = {"grupo2"}, dataProvider = "ciudades", description = "Despegar")
public void Despegar (String ciudades) throws Exception {  
//WebDriver driver = DriverFactory.LevantarBrowser(null, "FIREFOX","https://www.despegar.com.ar/");
DespegarHomePage homePage = new DespegarHomePage(driver);

	homePage.ClickBoton();
	homePage.ClicIngresarDestino();
	homePage.IngresarDestino(ciudades);
	homePage.ClickLista();
	homePage.SeleccionarFecha();
	homePage.SeleccionarfechaEntrada();
	homePage.SeleccionarfechaSalida();
    homePage.Aplicar();
    homePage.seleccionarHabitacion();
    homePage.Adultos();
    homePage.Menor();
    homePage.EdadMenores();
    homePage.SeleccionAplicar();
    homePage.buscar();

    DespegarResultsPage resultsPage = homePage.validar();
    Assert.assertTrue(resultsPage.tituloEsVisible(), "El titulo no está visible");
}
 @AfterMethod
 public  void endSetup() {
    driver.close();
  }
}






