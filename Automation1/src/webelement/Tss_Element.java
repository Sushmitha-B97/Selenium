package webelement;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tss_Element {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement ele = driver.findElement(By.name("login"));
//this is for only webelement capture or TSS without using TakesScreenShot interface

File src = ele.getScreenshotAs(OutputType.FILE); 
File dst= new File("C:\\Users\\sushm\\OneDrive\\Pictures\\SeleniumTSS\\btn1.jpeg");
FileHandler.copy(src, dst);

}
}
