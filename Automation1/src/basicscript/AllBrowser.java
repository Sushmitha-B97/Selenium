package basicscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","./SW/geckodriver.exe");
		FirefoxDriver driver1= new FirefoxDriver();
		//driver.close();
		driver1.quit();
		
}
}