package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_data {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("./TestData/FaceBook.xlsx");
	XSSFWorkbook work= new XSSFWorkbook(fis);
	XSSFSheet sheet = work.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(3); //usn
	XSSFCell cell = row.getCell(0);
	String usn = cell.getStringCellValue();
	
	//psw
	XSSFCell cell1 = row.getCell(1);//psw
	String psw = cell1.getStringCellValue();
	System.out.println(usn+" "+" "+psw);  
//	System.out.println(psw);
	
	System.setProperty("webdriver.chrome.driver", "./SW/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(usn);
	driver.findElement(By.id("pass")).sendKeys(psw);
	driver.findElement(By.name("login")).click(); 
	
	work.close();
	fis.close();
}
}
