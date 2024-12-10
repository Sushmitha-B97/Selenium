package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_Hold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
   WebElement hold = driver.findElement(By.id("circle"));
   Actions act = new Actions(driver);
   act.clickAndHold(hold).perform();
   Thread.sleep(2000);
   driver.quit();
}
}