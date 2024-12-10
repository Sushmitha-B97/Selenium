package Sysnchronization;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EW_demoQsp {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
	driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	WebElement ele = driver.findElement(By.xpath("//button[text()='Start']"));
	
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.click();
	driver.findElement(By.xpath("//button[text()='Reset']")).click();
	
	// With Element....
	driver.findElement(By.xpath("//a[text()='With Element']")).click();
    driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("2");
	WebElement el = driver.findElement(By.xpath("//button[text()='Start']"));
	WebDriverWait wait1= new WebDriverWait(driver, 10);
	wait1.until(ExpectedConditions.visibilityOf(el));
	el.click();
	
	WebElement ele1 = driver.findElement(By.xpath("//p[text()='Do you like Automation']")); 
    String photo="./Photos/";
	Date d= new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":", "-");
	File src = ele1.getScreenshotAs(OutputType.FILE);
	File dst= new File(photo+d2+".jpeg");
	FileHandler.copy(src, dst);
}
}