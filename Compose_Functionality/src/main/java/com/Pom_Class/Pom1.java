package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='gb_ma gb_id gb_Md gb_1d']")
	private WebElement LoginGmail;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath = "(//div[@jsname='EBHGs'])[1]")
	private WebElement MsgVerify;
	
	@FindBy(xpath = "//textarea[@role='combobox']")
	private WebElement SearchGmail;
	
	@FindBy(xpath = "//h3[text()='Gmail: Private and secure email at no cost']")
	private WebElement ClickGooglemail;

	
	@FindBy(xpath = "//a[text()='Sign in']")
	private WebElement SelectSignIn;
	
	@FindBy(xpath = "//div[text()='software Tester']")
	private WebElement User;
	
	
	@FindBy(xpath = "(//div[@role='button'])[7]")
	private WebElement ComposeMail;
	
	@FindBy(xpath = "//div[@role='textbox']")
	private WebElement MessageBody;
	
	@FindBy(xpath = "//input[@name='subjectbox']")
	private WebElement MessageSubject;

	public Pom1(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
	}

	

	public WebElement getLoginGmail() {
		return LoginGmail;
	}



	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	
	public WebElement getMsgVerify() {
		return MsgVerify;
	}



	public WebElement getSearchGmail() {
		return SearchGmail;
	}

	public WebElement getClickGooglemail() {
		return ClickGooglemail;
	}

	public WebElement getSelectSignIn() {
		return SelectSignIn;
	}



	public WebElement getUser() {
		return User;
	}

	public WebElement getComposeMail() {
		return ComposeMail;
	}

	public WebElement getMessageBody() {
		return MessageBody;
	}

	public WebElement getMessageSubject() {
		return MessageSubject;
	}
	
	
}
