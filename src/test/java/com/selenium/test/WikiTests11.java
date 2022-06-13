package com.selenium.test;
// WikiTest11 con Page Objects

import org.openqa.selenium.WebDriver;  
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import test.WikiHomePage;
import test.WikiResultsPage;
public class WikiTests11 extends DriverFactory {
	
	@DataProvider(name="Data Provider Wiki")
	public Object[][] dpMethod(){
		return new Object [][] {{"Selenium"},{"Java"}, {"TestNG"}};
	}

@Test(groups = {"grupo1"}, dataProvider = "Data Provider Wiki", description = "Validar que las busquedas en Wikipedia funcionan")
public void ValidarBusquedaWikipedia (String searchText ) throws Exception {  
WebDriver driver = DriverFactory.LevantarBrowser(null, "CHROME","https://es.wikipedia.org/");
WikiHomePage homePage = new WikiHomePage(driver);
Assert.assertTrue(homePage.searchInputEsvisible(), "El input no está visible");
WikiResultsPage resultsPage = homePage.searchText(searchText);
Assert.assertTrue(resultsPage.tituloEsVisible(), "El titulo no está visible");
driver.close();


}
}










