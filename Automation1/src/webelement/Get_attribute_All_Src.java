package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute_All_Src {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> link = driver.findElements(By.xpath("//img"));

		for(WebElement a:link)
		{
		String hr = a.getAttribute("src");
		
		System.out.println(hr);

}
}
}