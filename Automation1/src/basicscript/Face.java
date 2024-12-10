package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {
	public static void main(String[] args) {
		
   System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	
	System.out.println(title);
	
/*	if(title.equals("hello Facebook"))
	{
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case is fail");
	}*/
if(title.contains("Facebook – log in or sign up"))
	{
	System.out.println("tc is pass");
	}
	else
	{
		System.out.println("tc is fail");
	} 
	driver.quit();
}
}
