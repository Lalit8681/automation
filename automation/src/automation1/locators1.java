package automation1;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locators1 {
	public static void main(String[] args) {
		WebDriver Driver= browse1.obrowser("https://www.facebook.com/");
//		WebElement email =Driver.findElement(By.id("email"));//by using the id
		WebElement email=Driver.findElement(By.name("email"));  //by using the name
		email.sendKeys("sisodiyalalit143@gmail.com");
		WebElement pass = Driver.findElement(By.cssSelector("input[type='password']"));  //by using the css
		pass.sendKeys("669999");
		//pass.sendKeys("9689084401");
		
//		WebElement frogot=Driver.findElement(By.className("_6ltj")); //by using the classname
//		frogot.click();
		
//		WebElement login =Driver.findElement(By.tagName("Button"));// by using the tag name
//		login.click();
		
		
	}

}
