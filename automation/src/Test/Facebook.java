package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(xpath="//input[@id='email']")private WebElement name;	
	@FindBy(xpath="//input[@id='pass']")private WebElement passward;
	@FindBy(xpath="//button[@name='login']")private WebElement Login;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement Forgotpass;
	@FindBy(xpath="(//a[@role='button'])[2]")private WebElement Createacc;
	@FindBy(xpath="//a[@id='not_me_link']") private WebElement Notyou;
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void name(String sendid) {
		name.sendKeys(sendid);
	}
	public void passward(String Pass) {
		passward.sendKeys(Pass);
	}
	public void login() {
		Login.click();
	}
	public void forgotpass() {
		Forgotpass.click();
	}
	public void Createacc() {
		Createacc.click();
	}
	

}
