package automation1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\admin\\Desktop\\hw.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(4).getCell(1).getStringCellValue();
		System.out.println(value);
	}

}
