package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_Selected {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver", "./SW/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://demoapps.qspiders.com/ui/checkbox/selected?sublist=1");
Thread.sleep(2000);

WebElement ele = driver.findElement(By.xpath("//input[@id='domain1']"));

boolean b = ele.isSelected();
if(b)
{
	System.out.println("element is selected");
}
else
{
	System.out.println("element is not selected");
}
driver.quit();
	}

}
