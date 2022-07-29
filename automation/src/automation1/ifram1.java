package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ifram1 {
	public static void main(String[] args) {
		WebDriver driver = browse1.obrowser("https://vctcpune.com/selenium/practice.html");
		driver.switchTo().frame("Courses-iframe");
//		driver.switchTo().frame(0);
		
//		iframe.swi
		WebElement course = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		course.click();
	}

}
