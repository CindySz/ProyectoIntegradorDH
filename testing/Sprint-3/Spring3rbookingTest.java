// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Spring3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void navigationtobooking() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .verMas")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector("a > button")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Mónica");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Bernal");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("mok2710@hotmail.com");
    driver.findElement(By.name("password")).sendKeys("mok123");
    driver.findElement(By.name("confirmPassword")).click();
    driver.findElement(By.name("confirmPassword")).sendKeys("mok123");
    driver.findElement(By.cssSelector("button:nth-child(5)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".submit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".label:nth-child(1) > div:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".label:nth-child(1) > input")).click();
    driver.findElement(By.cssSelector(".label:nth-child(1) > input")).sendKeys("mok2710@hotmail.com");
    driver.findElement(By.cssSelector(".label:nth-child(2) > input")).sendKeys("mok123");
    driver.findElement(By.cssSelector(".submit")).click();
    driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .verMas")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,600)");
    driver.findElement(By.cssSelector("a > button")).click();
    js.executeScript("window.scrollTo(0,212)");
    driver.findElement(By.cssSelector(".label:nth-child(4) > input")).click();
    driver.findElement(By.cssSelector(".label:nth-child(4) > input")).sendKeys("TAMPA");
    driver.findElement(By.id("cardSelect")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".selectLabel"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("react-select-4-option-1"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".select")).click();
    driver.findElement(By.id("react-select-4-option-4")).click();
    driver.findElement(By.cssSelector(".submit")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".rdrMonth:nth-child(2) .rdrDay:nth-child(21) > .rdrDayNumber > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}