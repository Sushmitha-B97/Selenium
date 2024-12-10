package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_keys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/textbox.html");
	
		WebElement ele1 = driver.findElement(By.id("a1"));
		ele1.sendKeys("selenium");
		WebElement ele2 = driver.findElement(By.id("a2"));
		ele2.sendKeys("selenium");
		WebElement ele3 = driver.findElement(By.id("a3"));
		ele3.sendKeys("selenium");
		WebElement ele4 = driver.findElement(By.id("a4"));
		ele4.sendKeys("selenium");
		WebElement ele5 = driver.findElement(By.id("a5"));
		ele5.sendKeys("selenium");
		
		Thread.sleep(1000);
		ele5.sendKeys(Keys.CONTROL+"ax");
		ele4.sendKeys(Keys.CONTROL+"ax");
		ele3.sendKeys(Keys.CONTROL+"ax");
		ele2.sendKeys(Keys.CONTROL+"ax");
		ele1.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(1000);
		driver.quit();
	}

}
