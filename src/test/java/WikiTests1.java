
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;

import test.WikiHomePage;


public class WikiTests1 extends DriverFactory {
	
	/*@BeforeMethod
	public void setup (ITestContext context) {
		String navegadorTestSuite = context.getCurrentXmlTest().getParameter("suite");
		String suite = navegadorTestSuite != null? navegadorTestSuite: "CHROME";	
	}*/

@Test(description = "Validar que las busquedas en Wikipedia funcionan")
public void ValidarBusquedaWikipedia() throws Exception {  
	//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
//driver.get("http://wikipedia.org");
	
WebDriver driver = null;
driver= LevantarBrowser(driver,"CHROME","https://es.wikipedia.org/");
WikiHomePage homePage = new WikiHomePage(driver);
WebElement searchInput = driver.findElement(By.id("searchInput"));  
Assert.assertTrue(searchInput.isDisplayed()); 
searchInput.sendKeys("Selenium");
searchInput.submit();
WebElement tituloResultado = driver.findElement(By.id("firstHeading")); 
System.out.println("Texto encontrado "+ tituloResultado.getText()); 
Assert.assertTrue(tituloResultado.isDisplayed());
driver.close();
}
}




