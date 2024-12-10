package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='search']")).sendKeys("tom and jerry");
Thread.sleep(2000);
driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
Thread.sleep(1000);
//driver.findElement(By.cssSelector("script[id='base-js']")).click();
driver.findElement(By.cssSelector("a[href='/watch?v=t0Q2otsqC4I&pp=ygUNdG9tIGFuZCBqZXJyeQ%3D%3D']")).click();
Thread.sleep(10000);
driver.quit();
	}

}
