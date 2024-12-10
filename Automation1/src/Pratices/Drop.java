package Pratices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement ele = driver.findElement(By.id("year"));
	Select s= new Select(ele);
	List<WebElement> opt = s.getOptions();
	ArrayList<String> l= new ArrayList<String>();
	for(WebElement we:opt) {
		String text = we.getText();
		l.add(text);
	}
	Collections.sort(l);
	for(String l1:l) {
		System.out.println(l1);
	}
	driver.quit();
}
}
