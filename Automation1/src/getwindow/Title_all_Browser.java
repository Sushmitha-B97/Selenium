package getwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_all_Browser {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
driver.findElement(By.name("NewWindow")).click();
Set<String> allwin = driver.getWindowHandles();
for(String win:allwin){
	driver.switchTo().window(win);
System.out.println(driver.getTitle());
Thread.sleep(1000);
driver.close();
}
}
}