package generic_libararies;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_excel 
{
	public static void get(String Sheet,int row,String val)  throws EncryptedDocumentException, IOException, InvalidFormatException 
	{
		FileInputStream fs=new FileInputStream("./Excel1/data123.xlsx");
		
		Workbook wb = WorkbookFactory.create(fs);
		
		Sheet sh = wb.getSheet(Sheet);
		
		Row row1 = sh.createRow(row);
		
		Cell cell = row1.createCell(0);
		
		cell.setCellValue(val);


		FileOutputStream fo=new FileOutputStream("./Excel1/data123.xlsx");
		
		wb.write(fo);
		
		
		
		
		

	}
}
