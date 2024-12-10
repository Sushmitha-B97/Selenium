package webelement;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_treset_accending {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		TreeSet<String>l= new TreeSet<String>(); //just creat array
		List<WebElement> opt = s.getOptions();
				for(WebElement we:opt)	{
					String text = we.getText();
				l.add(text); //add data to array
				}
				 //tree set is auto-sorted so no need to write collection.sort() method
				for(String l1:l)//array type conn't print directly need to covert for each
				{
					System.out.println(l1);
				}
				driver.quit();
		}

}
