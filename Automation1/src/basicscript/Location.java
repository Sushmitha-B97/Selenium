package basicscript;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9564672,77.6208384,9z?entry=ttu&g_ep=EgoyMDI0MTAwOS4wIKXMDSoASAFQAw%3D%3D");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys("Ramanagara");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		//WebElement ele = driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']"));
			//ele.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//span[@class='google-symbols'and @jstcache='171']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
	  
		
		
		
		
		
			

// driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Ramanagara");
      // driver.findElement(By.xpath("//span[@class='google-symbols'and @jstcache='171']")).click();
     // Thread.sleep(5000);
     //driver.findElement(By.xpath("//input[@placeholder='Choose destination...']")).sendKeys("Bangalore");
	//driver.findElement(By.xpath("//span[@class='google-symbols'and @jstcache='169']")).click();
		
	//div[@id='directions-searchbox-0']//span[@class='google-symbols'][contains(text(),'')]
