package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSel {
  @Test
  public void f() {
		String exePatch = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePatch); //Agregando la propiedad con la ruta del ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
  }
}
