package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	public static String getTD(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\OneDrive\\Documents\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("book1");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
}
