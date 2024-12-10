package javaSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 
	JavascriptExecutor js=(JavascriptExecutor) driver;

	WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));
	Point p = ele.getLocation();
	int x = p.getX();
	int y = p.getY();
	System.out.println(x+" "+" "+y);
	js.executeScript("window.scrollBy("+x+","+y+")");
	ele.click();
}
}
