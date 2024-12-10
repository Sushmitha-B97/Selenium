package Sysnchronization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_file {
	@Test
	public static String getdata() throws FileNotFoundException, IOException {
		Properties p = new Properties();
		p.load(new FileInputStream("./PropertyFile/data.properties"));
		String url = p.getProperty("baseurl");
		return url;
		
	}

}
