package HandlingDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingProperityFile {

	public static void main(String[] args) throws IOException {
		//get the java representative object f the physical file
		FileInputStream fis= new FileInputStream("C:\\Users\\E SUBRAMANYAM\\OneDrive\\Desktop\\commomdata.properity.txt");
		//create an object of property file
		Properties p = new Properties();
		//load the file
		p.load(fis);
		//get the data(value) by using key
		String url = p.getProperty("Url");
		String un = p.getProperty("Username");
		String pw = p.getProperty("Password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);

	}

}
