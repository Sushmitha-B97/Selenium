package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_keys {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/checkbox.html");
		WebElement ele1 = driver.findElement(By.id("a1"));
		ele1.sendKeys(Keys.SPACE);
		WebElement ele2 = driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.SPACE);
		WebElement ele3 = driver.findElement(By.id("a3"));
		ele3.sendKeys(Keys.SPACE);
		WebElement ele4 = driver.findElement(By.id("a4"));
		ele4.sendKeys(Keys.SPACE);
		WebElement ele5 = driver.findElement(By.id("a5"));
		ele5.sendKeys(Keys.SPACE); 
		
		
		ele5.sendKeys(Keys.SPACE);
		ele4.sendKeys(Keys.SPACE);
		ele3.sendKeys(Keys.SPACE);
		ele2.sendKeys(Keys.SPACE);
		ele1.sendKeys(Keys.SPACE);
	//	Thread.sleep(2000);
		//driver.quit();
		
		
	}

}
