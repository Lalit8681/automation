package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class forprCT2 {
public static void main(String[] args) {
	WebDriver driver= forpract.openb("https://vctcpune.com/selenium/practice.html");
	WebElement dp=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
	Select sel = new Select(dp);
//	sel.selectByVisibleText("Option1");// drop by text
	sel.selectByIndex(2);
	
}
}
