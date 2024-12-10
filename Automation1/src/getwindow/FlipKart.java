package getwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 16 pro black titanium");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Pro (Natural Titanium, 128 GB)']")).click();
		String pid = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
	//	all.remove(pid);
		for(String we:all) {
			driver.switchTo().window(we);
			Thread.sleep(1000);
		}
		JavascriptExecutor js=(JavascriptExecutor)	driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		//driver.close();
			
}
}