package getwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.name("NewWindow")).click();
	Set<String> allwin = driver.getWindowHandles();
	System.out.println(allwin.size());
	for(String wh:allwin) {
		System.out.println(wh);
	}
}
}
