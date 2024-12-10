package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotcls {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(1000);
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	

	
}
}
