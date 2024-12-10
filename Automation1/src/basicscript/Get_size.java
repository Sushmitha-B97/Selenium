package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_size {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
WebElement ele = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
Dimension p = ele.getSize();
System.out.println(p);
int h = ele.getSize().getHeight();
System.out.println(h);
int w = ele.getSize().getWidth();
System.out.println(w); 
Thread.sleep(2000);
driver.quit();
}
}