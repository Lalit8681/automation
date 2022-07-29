package auto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pract3 {
	public static void main (String[]args) throws IOException {
		WebDriver driver = forpract.openb("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drop =driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select yaho= new Select(drop);
		yaho.selectByVisibleText("Google");
		forpract.screen(driver, "trial2");
		WebElement animal=driver.findElement(By.xpath("//select[@id='animals']"));
		Select avtar =new Select(animal);
	//	avtar.selectByVisibleText("Avatar");
	//	avtar.selectByIndex(3);
		avtar.selectByValue("avatar");
		forpract.screen(driver, "trial3");
	}

}
