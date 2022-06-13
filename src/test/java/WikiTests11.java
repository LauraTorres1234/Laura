// WikiTest11 con Page Objects

import org.openqa.selenium.WebDriver;  
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import test.WikiHomePage;
import test.WikiResultsPage;
public class WikiTests11 extends DriverFactory {
	
@Test(description = "Validar que las busquedas en Wikipedia funcionan")
public void ValidarBusquedaWikipedia() throws Exception {  
WebDriver driver = DriverFactory.LevantarBrowser(null, "CHROME","https://es.wikipedia.org/");
WikiHomePage homePage = new WikiHomePage(driver);
Assert.assertTrue(homePage.searchInputEsvisible(), "El input no está visible");
WikiResultsPage resultsPage = homePage.searchText("Selenium");
Assert.assertTrue(resultsPage.tituloEsVisible(), "El titulo no está visible");
//driver.close();
}
}








