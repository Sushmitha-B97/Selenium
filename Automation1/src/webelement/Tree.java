package webelement;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tree {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		TreeSet<String>t= new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> count = s.getOptions();
	for (WebElement we : count) {
		String le = we.getText();
		t.add(le);
		
		}
	
	for(String t1:t) {
		System.out.println(t1);
	}
}
}