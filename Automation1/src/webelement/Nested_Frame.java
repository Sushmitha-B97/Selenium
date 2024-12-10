package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nested_Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/NestedF.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sushmitha");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sush123");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9538358149");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sus@gmail.com");
		Thread.sleep(2000);
	    driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//input[@type='text']")).clear(); //mobile
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//input[@type='text']")).clear();//usn

	}
	}