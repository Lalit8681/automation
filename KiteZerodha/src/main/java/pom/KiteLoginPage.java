package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userId;
	@FindBy(xpath="//input[@id='password']") private WebElement Passward;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement contine;
	@FindBy(xpath="//input[@icon='search']") private WebElement Search;
	@FindBy(xpath="//li[@class='search-result-item selected isadded']") private WebElement StockSelection;
	@FindBy(xpath="//button[@data-balloon='Buy']") private WebElement moveOnBuy;
	@FindBy(xpath="//button[@data-balloon='Sell']") private WebElement moveOnSell;
	@FindBy(xpath="//button[@data-balloon='Chart']") private WebElement moveOnChart;
	@FindBy(xpath="//button[@data-balloon='Market depth widget']") private WebElement moveOnMarketDepth;
	@FindBy(xpath="//button[@data-balloon='Added']") private WebElement moveOnAdd;

	
	public KiteLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassward(String pass) {
		Passward.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public void enterPin(String PinNumber) {
		pin.sendKeys(PinNumber);
	}
	public void clickOnContinue() {
		contine.click();
	}
	public void SendSearchKey(String StockName) {
		Search.sendKeys(StockName);
	}
	public void ClickOnStock() {
		StockSelection.click();
	}
	public void moveOnFirstResult(WebDriver driver) {
		Actions action =new Actions(driver);
		action.moveToElement(StockSelection);
		action.perform();		
	}
	public void MoveOnBuy(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(moveOnBuy);
		action.click();
		action.perform();
	}
	public void MoveOnSell(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(moveOnSell);
		action.click();
		action.perform();
	}
	public void MoveOnChart(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(moveOnChart);
		action.click();
		action.perform();
	}
	public void MoveOnMarketDepth(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(moveOnMarketDepth);
		action.click();
		action.perform();
	}
	public void MoveOnAdd(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(moveOnAdd);
		action.click();
		action.perform();
	}
}
