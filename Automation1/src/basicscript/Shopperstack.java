package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shoppersstack.com/"); // pass url
		driver.manage().window().maximize();
		
        Thread.sleep(5000);
		
		String title = driver.getTitle(); // fetch title of webpage
		System.out.println(title);
		
		String url = driver.getCurrentUrl(); // fetch the current page url
		System.out.println(url);
		
		String src = driver.getPageSource(); // fetch the source code in the form fof html
		System.out.println(src);
		
		driver.close();
		
	}

}
