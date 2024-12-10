package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/Mainpage.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("sushmitha");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
	//	driver.switchTo().frame("f1");
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sush123");
	}

}
