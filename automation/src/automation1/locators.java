package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators {
	public static void main(String[] args) {
		WebDriver driver = browse1.obrowser("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sisodiyalalit143@gmail.com");
		
		WebElement pass= driver.findElement(By.id("pass"));
		pass .sendKeys("9689084401");
		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click()
		;
	}

}
