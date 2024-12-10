package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Map {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/maps/@13.0012817,77.5487917,14z?entry=ttu&g_ep=EgoyMDI0MTAwOS4wIKXMDSoASAFQAw%3D%3D");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchboxinput']")).sendKeys("Ramanagara");
	//	driver.findElement(By.xpath("//button[@id='searchbox-searchbutton']//span[@class='google-symbols'][contains(text(),'')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']//span[@class='google-symbols'][contains(text(),'')]")).click();
		Thread.sleep(2000);
		driver.quit();

}
}