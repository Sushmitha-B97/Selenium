package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qdemo_IS {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//input[@id='domain1']"));

		boolean b = ele.isSelected();
		if(b)
		{
			System.out.println("element is selected");
		}
		else
		{
			System.out.println("element is not selected");
		}
		
		
		driver.navigate().to("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//li[text()='Disabled']")).click(); //is if comment this line i get enabled msg
		WebElement ele1= driver.findElement(By.id("name"));
		boolean ena = ele1.isEnabled();
		if(ena)
		{
			System.out.println("element enabled");
		}
		else
		{
			System.out.println("ele disabled");
		}
		
		
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Email Id']"));
		boolean d = ele2.isDisplayed();
		if(d) {
			System.out.println("element is displayed");
			
		}
		else
		{
			System.out.println("element is not displayed");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
