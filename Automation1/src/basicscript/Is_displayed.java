package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_displayed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//label[text()='Email Id']"));
	boolean l = ele.isDisplayed();
	if(l) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	Thread.sleep(2000);
	driver.quit();
}
}
