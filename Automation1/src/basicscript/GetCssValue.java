package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
	WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
	String size = ele.getCssValue("font-size");
	System.out.println(size);
}
}
