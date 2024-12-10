package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceding_sibling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//td[text()='All Time Blockbuster']/preceding-sibling::td[3]")).getText());
		Thread.sleep(1000);
		driver.quit();
		
	}

}

