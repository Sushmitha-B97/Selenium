package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Keyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/keys.html");
		
		/*WebElement ele1 = driver.findElement(By.id("a1"));
	    ele1.sendKeys(Keys.CONTROL+"a"+"x");
	    Thread.sleep(2000);
	    
	    WebElement ele2 = driver.findElement(By.id("a3"));
	    ele2.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	    
	    WebElement ele3 = driver.findElement(By.id("a2"));
	    ele3.sendKeys(Keys.CONTROL+"a"+"x");
	    Thread.sleep(2000);
	    ele1.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	     
	    ele2.sendKeys(Keys.CONTROL+"a"+"x");
	    Thread.sleep(2000);
	    ele3.sendKeys(Keys.CONTROL+"v"); */
		
	    Thread.sleep(2000); 
		WebElement ele1 = driver.findElement(By.id("a1"));
	    ele1.sendKeys(Keys.CONTROL+"a"+"x");
	    Thread.sleep(2000);
	    
	    WebElement ele2 = driver.findElement(By.id("a3"));
	    ele2.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	    
	    WebElement ele3 = driver.findElement(By.id("a2"));
	    ele3.sendKeys(Keys.CONTROL+"a"+"x");
	    Thread.sleep(2000);
	    ele1.sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(2000);
	    
	    ele3=driver.findElement(By.id("a3"));
	    Thread.sleep(2000);
	    ele3.sendKeys(Keys.CONTROL+"ax");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"v");
	    Thread.sleep(1000);
	    driver.quit();
	    }

}
