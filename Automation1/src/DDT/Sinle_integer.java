package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sinle_integer {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Testdata/FaceBook.xlsx");
	XSSFWorkbook work= new XSSFWorkbook(fis);
	XSSFSheet sheet = work.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(4);//it fetch the integer value
	XSSFCell cell = row.getCell(0);
	String val = cell.getStringCellValue();
	System.out.println(val);
	work.close();
	fis.close();
	
}
}
