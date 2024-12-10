package getwindow;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_qsp_Scroll {
public static void main(String[] args) throws InterruptedException, IOException {
		
   System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
	
	Set<String> all = driver.getWindowHandles();
	for(String we:all) {
		driver.switchTo().window(we);
	}
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
	Point p = ele.getLocation();
	int x = p.getX();
	int y = p.getY();
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	driver.findElement(By.xpath("//button[text()='Accept Our Policy']")).click();
	GenricTss.GenericPhoto.getPhoto(driver);
	
}
}