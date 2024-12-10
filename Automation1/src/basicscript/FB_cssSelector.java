package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sush@gamil.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Mitha@1997");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
