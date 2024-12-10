package webelement;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Typecaste_treeToarray {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		TreeSet<String>t= new TreeSet<String>(); 
		
		List<WebElement> opt = s.getOptions();
				for(WebElement we:opt)	{
					String text = we.getText();
				t.add(text); 
				}
				ArrayList<String>l= new ArrayList<String>(t); 
				for(String l1:t)
				{
					System.out.println(l1);
				}
				driver.quit();
}
}