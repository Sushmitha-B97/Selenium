package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
 WebElement ele = driver.findElement(By.xpath("//input[@type='password']"));
	Point p = ele.getLocation();
	System.out.println(p);
	System.out.println(p.getX());
	System.out.println(p.getY());
	Thread.sleep(2000);
	driver.quit(); 
}
}