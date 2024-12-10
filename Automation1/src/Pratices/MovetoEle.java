package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoEle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.navigate().to("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));//moveToElement --- mouse hover
	Actions act= new Actions(driver);
	act.moveToElement(ele).perform();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().to("https://demoapps.qspiders.com/ui/clickHold?sublist=0"); //clickAndHold
	Thread.sleep(2000);
	WebElement el = driver.findElement(By.id("circle"));
	Thread.sleep(2000);
	Actions ac= new Actions(driver);
	ac.clickAndHold(el).perform();
	Thread.sleep(2000);
	
	driver.navigate().forward();
	driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html"); //doubleClick
	WebElement bt = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions a= new Actions(driver);
	Thread.sleep(2000);
	a.doubleClick(bt).perform();
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");// right click
	WebElement rclk = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions aclk=  new Actions(driver);
	aclk.contextClick(rclk).perform();
	
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");//dragAndDrop
	WebElement src = driver.findElement(By.id("box1"));
	WebElement dst = driver.findElement(By.xpath("//div[text()='Norway']"));
	Actions ad= new Actions(driver);
	Thread.sleep(2000);
	ad.dragAndDrop(src, dst).perform();
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.quit();
	
}
}
