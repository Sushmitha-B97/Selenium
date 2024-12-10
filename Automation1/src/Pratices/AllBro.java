package Pratices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
	driver.close();
	System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
	driver= new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.quit();
	}

}
