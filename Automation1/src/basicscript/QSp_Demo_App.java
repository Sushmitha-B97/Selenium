package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSp_Demo_App {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Text Field']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("sushmitha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/ui/button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/ui/link']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='attended']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='domain1']")).click();  
		
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//a[@href='/ui/toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out']")).click();
		Thread.sleep(2000);
		driver.quit();
}
}