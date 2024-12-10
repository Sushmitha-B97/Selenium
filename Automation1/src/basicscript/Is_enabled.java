package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement ele= driver.findElement(By.id("name"));
		boolean ena = ele.isEnabled();
		if(ena)
		{
			System.out.println("element enabled");
		}
		else
		{
			System.out.println("ele disabled");
		}
	}

}
