package automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mouseScroll {
	public static void main(String[] args) {
		WebDriver driver=browse1.obrowser("https://vctcpune.com/");
		WebElement social=driver.findElement(By.xpath("(//a[@class='et_pb_button et_pb_promo_button'])[26]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", social);
	}

}
