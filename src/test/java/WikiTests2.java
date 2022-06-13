
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;


public class WikiTests2 extends DriverFactory {

@Test(description = "TareaUno")
public void ValidarBusquedaWikipedia() throws Exception {
	//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
//driver.get("https://es.wikipedia.org/");
WebDriver driver = null;
driver= LevantarBrowser(driver,"FIREFOX","https://es.wikipedia.org/");
WebElement searchInput = driver.findElement(By.xpath("//span[@id='Bienvenidos_a_Wikipedia,']")); 
Assert.assertTrue(searchInput.isDisplayed());  
WebElement Leer = driver.findElement(By.xpath("//div[@class='main-footer-actions main-plainlist nomobile']/ul/li[1]"));
Assert.assertTrue(Leer.isDisplayed());
Leer.click();
WebElement validarTitulo = driver.findElement(By.id("firstHeading"));
Assert.assertTrue(validarTitulo.isDisplayed());
//driver.close();
}
}










