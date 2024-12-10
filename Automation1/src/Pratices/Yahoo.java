package Pratices;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&activity=ybar-signin&pspid=2023538075&done=https%3A%2F%2Fwww.yahoo.com%2F%3Fguccounter%3D1%26guce_referrer%3DaHR0cHM6Ly9pbi5zZWFyY2gueWFob28uY29tLw%26guce_referrer_sig%3DAQAAADLE05cPQVbaBcWqK-VTbjvzwP_N-DYeiyeC69own9boHEBFU2wb4qsydoCJ7zg7yRlZisQy9oKXsVjquNUDVcwea_bo7Z5pAQQmc3zEFXV9dLc_xMfN3Hfe_2aG9-jFRNGQGYVP3SWLqu2BLYcu639ZxayNYFEIaZYbrNvWM3Eo&add=1");
		driver.findElement(By.id("login-username")).sendKeys("sushmithabasavaraju@yahoo.com");
		driver.findElement(By.name("signin")).click();
		driver.findElement(By.name("password")).sendKeys("Sus1997@");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("ybarMailLink")).click();
		Set<String> all = driver.getWindowHandles();
		for(String we:all) {
			driver.switchTo().window(we);
		}
		
		driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
		driver.findElement(By.id("message-to-field")).sendKeys("sushmithabasavaraju@yahoo.com");
		driver.findElement(By.id("compose-subject-input")).sendKeys("Application for QA");
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi my name is sushmitha");
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		
	}
}
