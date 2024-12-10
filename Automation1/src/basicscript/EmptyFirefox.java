package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./SW/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
	//driver.close();

	}

}
