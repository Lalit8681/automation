package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction {
	public static void main(String[] args) {
		WebDriver driver =browse1.obrowser("https://demoqa.com/text-box");
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Lalit");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("lrs");
		action.build().perform();
//		driver.findElement(By.xpath(""))
		action.sendKeys(Keys.TAB);
		action.sendKeys("Pune");
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
	}

}
