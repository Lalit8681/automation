package automation1;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class browse1 {
	
	public static WebDriver obrowser(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	
		public static String time() {
			  DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
			 LocalDateTime currenttime= LocalDateTime.now();
			 String dt=dft.format(currenttime);
			 return dt;
	}
		 public static void screen (WebDriver driver, String name) throws IOException {
				 	File Sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					String dt=browse1.time();
					File destination = new File("H:\\st\\screenshots\\"+name+"__"+dt +".png");
					FileHandler.copy(Sourse, destination);
	 }
		 public static String parametric(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
			 FileInputStream file =new FileInputStream("C:\\selenium\\Book1.xlsx");
			 String Fetchdata=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			 return Fetchdata;
		 }
		 public static void mousea() {
			 
		 }
			 
		
		
	

}
