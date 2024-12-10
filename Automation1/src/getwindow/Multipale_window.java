package getwindow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Multipale_window {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions(driver);
		Robot r= new Robot();
		ArrayList<WebElement>l= new ArrayList<WebElement>();
		
		WebElement el = driver.findElement(By.xpath("//a[text()='About']"));
		l.add(el);
		WebElement el1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		l.add(el1);
		WebElement el2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		l.add(el2);
		WebElement el3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		l.add(el3);
		WebElement el4 = driver.findElement(By.xpath("//span[text()='Support']"));
		l.add(el4);
		WebElement el5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		l.add(el5);
		
		for(WebElement l1:l) {
		act.contextClick(l1).perform();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> wind = driver.getWindowHandles();
		ArrayList<String>t= new ArrayList<String>(wind);
		Collections.sort(t);
		String we = t.get(3);
		driver.switchTo().window(we);
	
	String title = driver.getTitle();
	
	System.out.println(title);
	Thread.sleep(2000);
	if (title.equals("Downloads | Selenium")) {
		
		driver.close();
	}
}
}
