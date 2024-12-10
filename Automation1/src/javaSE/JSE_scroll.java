package javaSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		for(int i=0; i<3; i++) {
			js.executeScript("window.scrollBy(0, 500)");
		}
		Thread.sleep(2000);
		for(int j=0; j<3; j++) {
			js.executeScript("window.scrollBy(0,-500)");
		}
		Thread.sleep(2000);
		driver.quit();
}
}