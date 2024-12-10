package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//System.out.println(driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).getText());
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	String text = ele.getText();
	System.out.println(text);
	
//	String title = ele.getAttribute("title");
	//System.out.println(title);
	Thread.sleep(2000);
	driver.quit();
}
}