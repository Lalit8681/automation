 package Pageobjectmode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation1.browse1;

public class POM {
	@FindBy (xpath="//input[@jsaction='paste:puy29d;']") private WebElement google;
	@FindBy (xpath="//input[@value='Google Search']") private WebElement enter;
	@FindBy (xpath="(//h3[@class='LC20lb MBeuO DKV0Md'])[2]") private WebElement kiteopen;
	@FindBy  (xpath="//input[@name='email']") private WebElement email;
	@FindBy	(xpath="//input[@name='pass']") private WebElement pass;
	@FindBy (xpath="//button[@name='login']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement  forgotpass;
	@FindBy (xpath="//a[text()='Create a Page']") private WebElement createpage;
	
	public POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void opengoogle(String googleurl) {
		google.sendKeys(googleurl);
	}
	public void openkite() {
		kiteopen.click();
	}
	public void clickenter() {
		enter.click();
	}
	public void email(String sendID) {
		email.sendKeys(sendID);
	}
	public void sendpass(String passward) {
	pass.sendKeys(passward);
	}
	public void loginpage() {
		login.click();
	}
	public void fpass() {
		forgotpass.clear();
	}
	public void cpage() {
		createpage.click();
	}
	public static void main(String[] args) {
		WebDriver driver =browse1.obrowser("https://www.facebook.com");
		POM facelogin=new POM(driver);
		facelogin.email("9527303110");
		facelogin.sendpass("9689084401");
		facelogin.loginpage();
	}
}
