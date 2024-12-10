package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/checkbox.html");
		List<WebElement> link = driver.findElements(By.xpath("//input"));
		
		int clk = link.size();
		for(int i=0; i<clk; i++) //accending order
		{                                                   
	WebElement we = link.get(i);
	    we.click();
	    }
		
		for(int i=clk-1; i>=0; i--) // decending order
		{
			WebElement we = link.get(i);
		    we.click();
		}
}
}