package Pratices;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Demo_Qsp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
	
	Select s= new Select(ele);
	s.selectByVisibleText("Germany");
/*	s.deselectAll();
	boolean b = s.isMultiple();
	if(b) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}*/
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
	Thread.sleep(2000);
    WebElement ele1 = driver.findElement(By.xpath("//option[text()='Running Shoes']/.."));
   Select s1= new Select(ele1);
   Thread.sleep(2000);
   s1.selectByVisibleText("Running Shoes");
   Thread.sleep(2000);
   s1.selectByValue("Casual Pants");
    Thread.sleep(2000);
   s1.selectByIndex(3);
   Thread.sleep(2000);
   
   driver.findElement(By.xpath("//a[text()='Disabled']")).click();
   Thread.sleep(2000);
   WebElement coun = driver.findElement(By.xpath("//select[@id='SelectCountry']"));
  boolean b = coun.isEnabled();
  if(b) {
	  System.out.println("ele is enabled");
  }
  else {
	  System.out.println("ele is not enabled");
  }
  Thread.sleep(2000);
 /* driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
  Thread.sleep(2000);
 WebElement ele2 = driver.findElement(By.xpath("(//div[text()='Select'])[1]"));
 Select s2= new Select(ele2);
 Thread.sleep(2000);
 s2.selectByVisibleText("//div[text()='Canada']"); */
//  driver.quit();
}
}
