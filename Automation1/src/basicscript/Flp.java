package basicscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='OPPO K12x 5G with 45W SUPERVOOC Charger In-The-Box (Breeze Blue, 128 GB)']")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> allwin = driver.getWindowHandles();
		for(String child:allwin){
			//System.out.println(child);
			if(! child.equalsIgnoreCase(parent)) {
				driver.switchTo().window(child);
			}
			
		}
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add Item']")).click();
		Thread.sleep(1000); 
		driver.quit();
		
	}

}
