package getwindow;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_App {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	driver.manage().window().maximize();
	//Thread.sleep(1000);
	driver.findElement(By.id("browserLink1")).click(); //new window
	Set<String> win= driver.getWindowHandles();
	ArrayList<String>t= new ArrayList<String>(win);
	String p = t.get(0);
	String p1 = t.get(1);
	driver.switchTo().window(p1);
	//Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("sush");
	System.out.println(driver.getTitle());
	//Thread.sleep(1000);
	driver.close();
	
	driver.switchTo().window(p);
	
	driver.findElement(By.xpath("//a[text()='New Tab']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.id("browserButton4")).click();
	//Thread.sleep(2000);
	Set<String> all = driver.getWindowHandles();
	for(String nw:all) {
		driver.switchTo().window(nw);
	}
	//Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("mitha");
	System.out.println(driver.getTitle());
	//Thread.sleep(1000);
	driver.close();
	
	driver.switchTo().window(p);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.id("browserButton3")).click();
	
	
}
}
