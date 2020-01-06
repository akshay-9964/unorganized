package generic_libararies;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_generic
{
	public static String getdata(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		FileInputStream fs=new FileInputStream("./excel/data99.xlsx");
		
		Workbook wb = WorkbookFactory.create(fs);
		
		Cell col = wb.getSheet(Sheet).getRow(row).getCell(cell);
		
		String val = col.toString();
		
		System.out.println(val);
		return val;
		
	}
}

