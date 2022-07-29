package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\KiteZerodha\\src\\test\\resources\\KiteZerodhaTestCases.xlsx");
		String fetchData=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return fetchData;
	}

}
