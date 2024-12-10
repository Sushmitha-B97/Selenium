package Pratices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_link {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("(//a)[last()-1]"));
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(WebElement l:link) {
			System.out.println(l.getText());
		}
}
}