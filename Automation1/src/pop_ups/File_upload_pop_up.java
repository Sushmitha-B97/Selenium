package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_pop_up {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
/*	driver.get("file:///C:/Users/sushm/OneDrive/Desktop/HTML%20Program/file%20upload%20pop-up.html");
	WebElement ele = driver.findElement(By.name("upload file"));
	ele.sendKeys("C:\\Users\\sushm\\OneDrive\\Desktop\\HTML Program\\file upload pop-up.html");
	//ele.sendKeys("C:\\Users\\sushm\\OneDrive\\Desktop\\Sushmitha_B.docx");  */
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(" //section[text()='File Uploads']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("fileInput"));
	ele.sendKeys("C:\\Users\\sushm\\OneDrive\\Desktop\\Sushmitha_B.docx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Upload File']")).sendKeys("C:\\Users\\sushm\\OneDrive\\Desktop\\Sushmitha_B.docx");  
	
	//drag and drop
	
	}
}


