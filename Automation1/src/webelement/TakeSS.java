package webelement;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeSS {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
Thread.sleep(2000);

TakesScreenshot ts = (TakesScreenshot) driver;//stp1 //this is complete application or complete page
File src = ts.getScreenshotAs(OutputType.FILE);//stp2
File dst= new File("C:\\Users\\sushm\\OneDrive\\Pictures\\SeleniumTSS\\failedTc1.jpeg");//stp3
FileHandler.copy(src, dst);//stp4
}
}
