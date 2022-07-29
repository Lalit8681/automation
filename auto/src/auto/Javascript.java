package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Javascript {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=forpract.openb("https://www.facebook.com");
//		WebElement name =driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
//		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='xyz2gamil.com'",email);
		Thread.sleep(2000);
			
	}

}
