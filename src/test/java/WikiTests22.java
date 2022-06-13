// WikiTest22 con Page Objects

import org.openqa.selenium.WebDriver;  
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import test.WikiHomePage22;
import test.WikiResultsPage22;



public class WikiTests22 extends DriverFactory {

@Test(description = "WikiTests")
public void ValidarBusquedaWikipedia() throws Exception {  
WebDriver driver = DriverFactory.LevantarBrowser(null, "CHROME","https://es.wikipedia.org/");
WikiHomePage22 homePage = new WikiHomePage22(driver);
Assert.assertTrue(homePage.tituloEsVisible2(), "El input no está visible");
WikiResultsPage22 resultsPage = homePage.botonLeer();
Assert.assertTrue(resultsPage.tituloEsVisible22(), "El titulo no está visible");
driver.close();
}
}












