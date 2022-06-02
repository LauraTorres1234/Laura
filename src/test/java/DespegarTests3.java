
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*import org.openqa.selenium.chrome.ChromeDriver;*/
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DespegarTests3 { 

@Test(description = "TareaDos")
public void ValidarBusquedaWikipedia() throws Exception { System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver-win32\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
/*	System.setProperty ( 	("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe"); */

driver.get("https://www.despegar.com.ar/");

driver.manage().window().maximize();

WebElement Cookies = driver.findElement(By.xpath("//a[@class='lgpd-banner--button eva-3-btn -white -md']"));
Cookies.click();

WebElement BtonAlojamientos= driver.findElement(By.xpath("//ul[@class='header-list-products']//a[@class='shifu-3-button-circle HOTELS paint-circle ']"));
Assert.assertTrue(BtonAlojamientos.isDisplayed());
BtonAlojamientos.click();

WebElement IngresaDestino = driver.findElement(By.xpath("//div[@class='sbox-places-destination--1xd0k']//div[@class='input-container']//input[@class='input-tag']"));
Assert.assertTrue(IngresaDestino.isDisplayed()); 
IngresaDestino.click();
Thread.sleep(2000);
IngresaDestino.sendKeys("san rafael, mendoza");
Thread.sleep(2000);
IngresaDestino.sendKeys(Keys.CONTROL);
IngresaDestino.sendKeys(Keys.ENTER);

List<WebElement> Lista = driver.findElements(By.xpath("//div[@class='ac-container']//div[@class='ac-group-container'][1]//ul[@class='ac-group-items']//span[@class='item-text']"));
Thread.sleep(2000);
WebElement Lugar = Lista.get(0);
Thread.sleep(2000);
Lugar.click(); 

WebElement SeleccionFecha = driver.findElement(By.xpath("//input[@placeholder='Entrada']"));
Assert.assertTrue(SeleccionFecha.isDisplayed()); 
SeleccionFecha.click();

WebElement seleccionarFechaEntrada = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-container ']//div [@class='sbox5-monthgrid sbox5-compact-view']//div[@class='sbox5-monthgrid-datenumber -weekday']"));
Thread.sleep(1000);
seleccionarFechaEntrada.click();

WebElement seleccionarFechaSalida = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-container ']//div [@class='sbox5-monthgrid sbox5-compact-view']//div[@class='sbox5-monthgrid-datenumber -weekday']"));
Thread.sleep(1000);
seleccionarFechaSalida.click();

WebElement Aplicar = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='calendar-footer-cta-container']/button[@class='sbox5-3-btn -primary -md']"));
Thread.sleep(1000);
Aplicar.click();


WebElement SeleccionHabitacion = driver.findElement(By.xpath("//div[@class='sbox5-distributionPassengers sbox5-box-distributionPassengers-ovr']"));
SeleccionHabitacion.click();

List<WebElement> Adultos = driver.findElements(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='sbox5-3-steppers -md']/button[@class='steppers-icon-right stepper__icon']"));
WebElement  MasAdultos = Adultos.get(0);
Thread.sleep(1000);
MasAdultos.click(); 


List<WebElement> Menores = driver.findElements(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='sbox5-3-steppers -md']/button[@class='steppers-icon-right stepper__icon']"));
WebElement MasMenores = Menores.get(1);
Thread.sleep(1000);
MasMenores.click(); 

WebElement edadMenor = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__row']//div[@class='select__row__options__container']//div[@class='select-container']//option[@value='14']"));
Thread.sleep(1000);
edadMenor.click();  


WebElement SeleccionAplica = driver.findElement(By.xpath("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='stepper__room__footer ']/a[@class='sbox5-3-btn -md -primary']"));
Thread.sleep(1000);
SeleccionAplica.click();


WebElement Buscar = driver.findElement(By.xpath("//button[@class='sbox5-box-button-ovr sbox5-3-btn -secondary -icon -lg']"));
Thread.sleep(1000);
Buscar.click();

WebElement  UltimaValidacion= driver.findElement(By.xpath("//div[@class='header-products-container']//a[@class='shifu-3-button-circle FLIGHTS paint-circle ']"));
Assert.assertTrue(UltimaValidacion.isDisplayed());

driver.close();
}
}