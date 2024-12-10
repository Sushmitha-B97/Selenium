package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleReadData {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("./Testdata/FaceBook.xlsx");
	XSSFWorkbook book= new XSSFWorkbook(fis);
	XSSFSheet sheet = book.getSheet("Sheet1");
	int lastR = sheet.getLastRowNum(); 
	
	for(int i=0; i<=lastR; i++)	//it have to ittirate one row to next row so we'r using for loop

	{
		XSSFRow row = sheet.getRow(i); //username
		XSSFCell cell1 = row.getCell(0);
		String cellval1 = cell1.getStringCellValue();
		//password
		XSSFCell cell2 = row.getCell(1); //password
		String cellval2 = cell2.getStringCellValue();
		System.out.println(cellval1+" "+" "+cellval2);
	}
	book.close();
	fis.close();
}
}
