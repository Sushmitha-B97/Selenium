package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class X_path_Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tom and jerry"); 
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail'and@href='/watch?v=t0Q2otsqC4I&pp=ygUNdG9tIGFuZCBqZXJyeQ%3D%3D']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='I like this']")).click(); //like btn
		Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//span[@class='yt-core-attributed-string yt-core-attributed-string--white-space-no-wrap'and text()='Sign in']")).getText());
Thread.sleep(2000);		
driver.quit();

		
	}
	
}







 