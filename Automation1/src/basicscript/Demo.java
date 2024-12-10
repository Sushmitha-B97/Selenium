package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/Sample%20link%20.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.findElement(By.tagName("a")).click();
	//driver.findElement(By.id("l1")).click();
	//driver.findElement(By.name("n1")).click();
	driver.findElement(By.className("c1")).click();
	driver.close();
}
}
