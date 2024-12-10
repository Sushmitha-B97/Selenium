package Sysnchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicity_wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
/*		String title = driver.getTitle();    // title
		System.out.println(title);
		WebDriverWait wait= new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		driver.findElement(By.id("email")).sendKeys("sush");  */
		
		
		/*System.out.println(driver.getCurrentUrl());  // url
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		driver.findElement(By.id("email")).sendKeys("sush");  */
		
		WebElement ele = driver.findElement(By.id("email"));  //vivbilityOf
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("sush");
	}

}
