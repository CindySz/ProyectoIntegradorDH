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
public class Spring2Test {
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
  public void registerwhitinvalidemail() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.findElement(By.cssSelector(".containerButton > button:nth-child(1)")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Mónica");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Bernal");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("mohd.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("mok123");
    driver.findElement(By.name("confirmPassword")).click();
    driver.findElement(By.name("confirmPassword")).sendKeys("mok123");
    driver.findElement(By.cssSelector("button:nth-child(5)")).click();
    driver.switchTo().alert().dismiss();
  }
  @Test
  public void succesFulLogInandRegistration() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.findElement(By.cssSelector(".containerButton > button:nth-child(1)")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Mónica");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Bernal");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("mok2710@hotmail.com");
    driver.findElement(By.name("password")).click();
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
    driver.findElement(By.cssSelector(".label:nth-child(1) > input")).click();
    driver.findElement(By.cssSelector(".label:nth-child(1) > input")).sendKeys("mok2710@hotmail.com");
    driver.findElement(By.cssSelector(".label:nth-child(2) > input")).sendKeys("mok123");
    driver.findElement(By.cssSelector(".submit")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".name > div"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void uRLNavigation() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".buttonLogIn"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Crear cuenta\')]"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".containerButton > button:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.name("name"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    {
      WebElement element = driver.findElement(By.name("surname"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    {
      WebElement element = driver.findElement(By.name("email"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    {
      WebElement element = driver.findElement(By.name("confirmPassword"));
      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
      assertTrue(isEditable);
    }
    throw new Error("`submit` is not a supported command in Selenium WebDriver. Please re-record the step in the IDE.");
    driver.findElement(By.linkText("Iniciar sesion")).click();
    driver.findElement(By.linkText("Registrar")).click();
    driver.findElement(By.cssSelector(".logo2")).click();
  }
  @Test
  public void findaproductbycity() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.findElement(By.cssSelector(".css-8mmkcg")).click();
    driver.findElement(By.cssSelector("#react-select-2-option-0 > .selectLocation")).click();
    driver.findElement(By.cssSelector(".search")).click();
    driver.findElement(By.cssSelector(".title:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".title:nth-child(1)")).click();
  }
  @Test
  public void productandfeatures() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".title:nth-child(1)"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector("div:nth-child(1) > .sc-jSMfEi img")).click();
    assertThat(driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .category")).getText(), is("Departamento"));
    driver.findElement(By.cssSelector("div:nth-child(2) > .sc-jSMfEi img")).click();
    assertThat(driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .category")).getText(), is("Casa de playa"));
    driver.findElement(By.cssSelector("div:nth-child(3) #collapseOne > img")).click();
    assertThat(driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .category")).getText(), is("Cabaña"));
    driver.findElement(By.cssSelector("div:nth-child(4) > .sc-jSMfEi img")).click();
    assertThat(driver.findElement(By.cssSelector(".sc-papXJ:nth-child(1) > .cardProduct .category")).getText(), is("Casa"));
    driver.findElement(By.cssSelector(".showAll")).click();
    driver.findElement(By.cssSelector(".sc-ftvSup:nth-child(1) .verMas")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".descriptionTitle"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".images")).click();
    driver.findElement(By.cssSelector(".styles-module_close__2I1sI")).click();
    js.executeScript("window.scrollTo(0,700)");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("a > button"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void selectdatesforbooking() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.findElement(By.cssSelector(".css-8mmkcg")).click();
    driver.findElement(By.cssSelector("#react-select-2-option-0 > .selectLocation")).click();
    driver.findElement(By.cssSelector(".inputBox")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".rdrDayToday"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".rdrDayNumber:nth-child(2) > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".rdrDay:nth-child(13)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".search")).click();
  }
  @Test
  public void shortpassword() {
    driver.get("http://homespot-frontend-app.s3-website.ca-central-1.amazonaws.com/");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    driver.findElement(By.cssSelector(".containerButton > button:nth-child(1)")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).sendKeys("Mónica");
    driver.findElement(By.name("surname")).click();
    driver.findElement(By.name("surname")).sendKeys("Bernal");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("mok2710@hotmail.com");
    driver.findElement(By.name("password")).sendKeys("mok123");
    driver.findElement(By.cssSelector("section")).click();
    driver.findElement(By.name("password")).sendKeys("123");
    driver.findElement(By.name("confirmPassword")).click();
    driver.findElement(By.name("confirmPassword")).sendKeys("123");
    driver.findElement(By.cssSelector("button:nth-child(5)")).click();
    assertThat(driver.findElement(By.cssSelector(".error")).getText(), is("La contraseña debe tener al menos 6 caracteres"));
  }
}