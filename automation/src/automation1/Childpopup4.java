package automation1;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Childpopup4 {
	public static void main(String[] args) {
		WebDriver driver=browse1.obrowser("https://vctcpune.com/");
		WebElement selenium = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		selenium.click();
//		String s=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		int a=	list.size();
		System.out.println(a);
		

		
		
	}

}
