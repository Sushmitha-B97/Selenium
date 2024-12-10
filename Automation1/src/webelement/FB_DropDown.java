package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("year"));
		
		Select s = new Select(ele);
		List<WebElement> count = s.getOptions();
		//System.out.println(count.size());
		for(WebElement y:count) {
			System.out.println(y.getText());
		}
		
		driver.quit();

	}

}
