package Pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/checkbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int count = ele.size();
		for(int i=0;i<count; i++) {
			WebElement we = ele.get(i);
			we.click();
		}
		for(int i=count-1;i>=0; i--) {
			WebElement we = ele.get(i);
			we.click();
		}
}
}