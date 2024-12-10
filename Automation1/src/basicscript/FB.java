package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sushmitha97@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Mitha@1997");
		driver.findElement(By.name("login")).click();
	//	System.out.println(driver.findElement(By.name("login")).getText());
		driver.close();
	}

}












//fb pws Mitha@1997