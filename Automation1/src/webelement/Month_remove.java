package webelement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month_remove {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
	    Select s = new Select(ele);
	    ArrayList<String> l= new ArrayList<String>();
	  List<WebElement> opt= s.getOptions();
     
     for(WebElement we:opt) {
    	String we1 = we.getText();
    	l.add(we1);
     }
     l.remove("Nov");
     for(String l1:l) {
    	 System.out.println(l1);
     }
     driver.quit();
	}

}
