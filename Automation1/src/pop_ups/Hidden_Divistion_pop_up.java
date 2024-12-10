package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divistion_pop_up {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
/*	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='21']")).click(); */
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sush");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
}
}