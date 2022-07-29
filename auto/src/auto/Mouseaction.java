package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =forpract.openb("https://www.flipkart.com");
		WebElement popup=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Actions action= new Actions(driver);
		action.click(popup);
		action.perform();
		Thread.sleep(10000);
		WebElement kids=driver.findElement(By.xpath("//div[text()='Kids']"));
		action.click(kids);
		action.perform();
		Thread.sleep(10000);
		WebElement elect=driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.click(elect);
		action.perform();
	}

}
