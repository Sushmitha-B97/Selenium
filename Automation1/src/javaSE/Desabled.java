package javaSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/Desabled.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("document.getElementById('a1').value='hello'");
		
		//clear the data by using jse
		js.executeScript("document.getElementById('a1').value=''");
}
}