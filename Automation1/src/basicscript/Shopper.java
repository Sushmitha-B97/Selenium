package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopper {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(10000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@name='men']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@alt='100% Natural Premium| Premium Badam Giri | High in Fiber & Boost Immunity | Real Nuts | Whole Natural Badam']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sushmithabbasavaraju97@gmail.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mitha123");
	driver.findElement(By.xpath("//span[text()='Login']")).click(); 
	
	driver.quit();
}
}
