package getwindow;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
		String ele = driver.getWindowHandle();
		System.out.println(ele); 
		
		
		
}
}