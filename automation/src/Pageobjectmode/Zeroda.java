package Pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeroda {
	@FindBy (xpath="//input[@jsaction='paste:puy29d;']") private WebElement Googlesearchbar;
	@FindBy (xpath="//input[@value='Google Search']") private WebElement entergsearch;
	@FindBy (xpath="(//h3[@class='LC20lb MBeuO DKV0Md'])[2]") private WebElement kiteopen;
	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	@FindBy (xpath="//input[@id='password']") private WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	
	public Zeroda(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void googlesearch(String openwebpage) {
		Googlesearchbar.sendKeys(openwebpage);
	}
	public void clickongoogleserach() {
		entergsearch.click();
	}
	public void clickonkite() {
		kiteopen.click();
	}
	public void senduserid(String id) {
		userid.sendKeys(id);
	}
	public void sendpass(String passward) {
		pass.sendKeys(passward);
	}
	public void clickonlogin() {
		login.click();
	}
	
	
}
