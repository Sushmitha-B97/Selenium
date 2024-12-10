package getwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_parent_Win {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("NewWindow")).click();
		String p_id = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String win:allwin){
			driver.switchTo().window(win);
			Thread.sleep(1000);
			if(win.equals(p_id)) {
				driver.close();
			}
}
}
}