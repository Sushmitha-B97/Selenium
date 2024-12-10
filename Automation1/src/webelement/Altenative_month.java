package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Altenative_month {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	WebElement ele = driver.findElement(By.id("month"));
	Select s= new Select(ele);
	List<WebElement> count = s.getOptions();
    int num = count.size();
    for(int i=0; i<num; i=i+2) { 
    //for(int i=0; i<=num; i++){
    //	if(i%2==0) {
    	
    	WebElement we = count.get(i);
    	String txt = we.getText();
    	System.out.println(txt);
    	}
    	
    }
	
}
