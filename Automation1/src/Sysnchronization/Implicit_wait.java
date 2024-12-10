package Sysnchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> all = driver.getWindowHandles();
		for(String we:all) {
			driver.switchTo().window(we);
		}
	WebElement ele = driver.findElement(By.id("email"));
	Point p = ele.getLocation();
	int x = p.getX();
	int y = p.getY();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
		driver.findElement(By.id("email")).sendKeys("sushmitha@gmail.com");
		driver.findElement(By.xpath("//button[text()='Subscribe']")).click();

}
}