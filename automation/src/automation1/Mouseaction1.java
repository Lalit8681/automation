package automation1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 {
	public static void dragdrop() throws InterruptedException {
	WebDriver driver =browse1.obrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	Actions action=new Actions(driver);
	WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	
	WebElement img=driver.findElement(By.xpath("(//h5[@class='ui-widget-header'])[1]"));
	WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
	action.dragAndDrop(img, trash);
	action.perform();
	Thread.sleep(3000);
	WebElement refresh =driver.findElement(By.xpath("//a[@title='Recycle this image']"));
	action.click(refresh);
	action.perform();
//	action.clickAndHold();
	}
	public static void drag() {
		WebDriver driver =browse1.obrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action=new Actions(driver);
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> img = driver.findElements(By.xpath("//h5[@class='ui-widget-header']"));
		
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		for(int i=0; i<img.size();i++) {
			WebElement picture=img.get(i);
			action.dragAndDrop(picture, trash);
			action.perform();
		}
		}
	public static void recycle() throws InterruptedException {
	WebDriver driver =browse1.obrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		Actions action = new Actions(driver);
		List<WebElement> image =driver.findElements(By.xpath("//h5[@class='ui-widget-header']"));
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i=0;i<image.size();i++) {
			System.out.println("ok");
			WebElement img=image.get(i);
			action.dragAndDrop(img, trash);
			action.perform();
			Thread.sleep(8000);
		}
		List<WebElement> refresh =driver.findElements(By.xpath("//a[@title='Recycle this image']"));
		Thread.sleep(30000);
		for(int r=0;r<refresh.size();r++) {
			System.out.println("reverse");
			WebElement Reverse=refresh.get(r);
			Thread.sleep(4000);
			action.click(Reverse);
//			action.dragAndDrop(trash, Reverse);
			action.perform();
		}
		}
	public static void amazon() throws InterruptedException {
		WebDriver driver =browse1.obrowser("https://www.amazon.in/");
		WebElement sign=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new Actions(driver);
//		action.click(sign);
		action.moveToElement(sign);
		action.perform();
		Thread.sleep(3000);
		WebElement youacc=driver.findElement(By.xpath("//span[text()='Your Account']"));
		action.moveToElement(youacc);
		action.perform();
		Thread.sleep(3000);
		WebElement youwl=driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		action.moveToElement(youwl);
		action.perform();
		action.click(youwl);
		action.perform();
		
	}
	public static void main(String[] args) throws InterruptedException {
//		Mouseaction1.dragdrop();
//		Mouseaction1.drag();
//	Mouseaction1.recycle();
	Mouseaction1.amazon();
	
	
	
	
	}

}
