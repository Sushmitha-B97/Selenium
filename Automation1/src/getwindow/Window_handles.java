package getwindow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handles {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Actions act= new Actions(driver);
	Robot r= new Robot();
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
      act.contextClick(ele).perform();
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
	Set<String> allwin = driver.getWindowHandles();
	ArrayList<String>t= new ArrayList<String>(allwin);
	String id = t.get(1);
	
	driver.close();
	driver.switchTo().window(id);
}
}
