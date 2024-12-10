package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
	String nm = ele.getAttribute("name");
	System.out.println(nm);
	Thread.sleep(2000);
	driver.quit();
	
}
}