package webelement;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_treset_decending {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		TreeSet<String>l= new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> we = s.getOptions();
		for(WebElement tree:we)
		{
			String t = tree.getText();
			l.add(t);
		}
		
		for(String l1:l)
		{
			System.out.println(l1);
		}
		driver.quit();
}
}