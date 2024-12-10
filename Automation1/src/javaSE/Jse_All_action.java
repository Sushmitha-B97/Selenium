package javaSE;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Jse_All_action {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(14, TimeUnit.MINUTES);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement ele = driver.findElement(By.xpath("//a[text()='Amazon Pay on Merchants']"));
	 Point p = ele.getLocation();
	 int x = p.getX();
	 int y = p.getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	//Thread.sleep(3000);
	String photo="./Photos/";
	Date d= new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":", "-");
	File src = ele.getScreenshotAs(OutputType.FILE);
	File dst= new File(photo+d2+".jpeg");
	FileHandler.copy(src, dst);
	
	js.executeScript("window.scrollBy(-"+x+",-"+y+")");
	//Thread.sleep(2000);
	WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
	String pho="./Photos/";
	Date dd= new Date();
	String da = dd.toString();
	String te = da.replaceAll(":", "-");
	File sr = txt.getScreenshotAs(OutputType.FILE);
	File ds= new File(pho+te+".jpeg");
	FileHandler.copy(sr, ds);
	
	js.executeScript("window.scrollBy("+x+","+y+")");
	GenricTss.GenericPhoto.getPhoto(driver);
}
}