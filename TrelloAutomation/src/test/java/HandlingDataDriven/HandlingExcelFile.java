package HandlingDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {


	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//get the java representative object of the physical file
		FileInputStream fis= new FileInputStream("./data/testscript.xisx");
		//open the workbook or create the work book
		Workbook wb = WorkbookFactory.create(fis);
	    wb.getSheet("createcustomer").getRow(1).getCell(3).setCellValue("skiped")
		FileOutputStream fos= new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		}

}
