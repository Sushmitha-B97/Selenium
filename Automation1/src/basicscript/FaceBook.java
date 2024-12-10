package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9538358149");
driver.findElement(By.id("pass")).sendKeys("Mitha@1997");
driver.findElement(By.xpath("//button[@name='login']")).click();
System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).getText());
driver.close();

	}

}
