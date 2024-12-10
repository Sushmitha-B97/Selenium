package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_minimize {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_WINDOWS);
	r.keyPress(KeyEvent.VK_D);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_WINDOWS);
	r.keyRelease(KeyEvent.VK_D);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	Thread.sleep(1000);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_F4);

}


}