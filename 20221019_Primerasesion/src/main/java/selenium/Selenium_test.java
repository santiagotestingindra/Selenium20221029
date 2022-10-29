package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

	public static void main(String[] args) {
		
		String exePatch = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePatch); //Agregando la propiedad con la ruta del ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}