package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hovering {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Fashion']"));
	Actions act= new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	driver.quit();
}
}
