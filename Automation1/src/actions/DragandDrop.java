package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.id("box6"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='Italy']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dst).perform();
		Thread.sleep(2000);
		driver.quit();
		
}
}