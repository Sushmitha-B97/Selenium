package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qdemo_get {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']"));
		String attribute = ele.getAttribute("id");
		System.out.println(attribute);
		Thread.sleep(2000);

		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		Thread.sleep(2000);
	    System.out.println(driver.findElement(By.id("btn")).getText());
     /* WebElement ele1 = driver.findElement(By.id("btn"));
     String text = ele1.getText();
     System.out.println(text); */
	    
	   Thread.sleep(1000);
	   driver.navigate().to("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//a[@href='/ui/link/payment']"));
	 String fsize = ele2.getCssValue("font-size");
	 System.out.println(fsize);
	 
	Thread.sleep(2000);
	WebElement ele3 = driver.findElement(By.xpath("//a[@href='/ui/link/payment']"));
	Dimension l = ele3.getSize();
	System.out.println(l);
	int h = ele3.getSize().getHeight();
	System.out.println(h);
	int w = ele3.getSize().getWidth();
	System.out.println(w);
	/*Point loc = ele3.getLocation();
	System.out.println(loc);*/
       
	}

}
