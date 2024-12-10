package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/Multi-drop-down.html");
		WebElement ele = driver.findElement(By.id("Udpi"));
		Select s= new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("Puvalu");
		Thread.sleep(2000);
		s.deselectAll();
		Thread.sleep(2000);
		boolean mu = s.isMultiple();
		if(mu)
		{
			System.out.println("drop-down is multi select");
		}
		else
		{
			System.out.println("drop-down is single select");
		}
		driver.quit(); 

	}

}
