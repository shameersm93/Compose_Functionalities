package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath = "//a[@aria-label='Google apps']")
	private WebElement GoogleApps;
	
	@FindBy(xpath = "(//span[@class='MrEfLc'])[10]")
	private WebElement Gmail;
	
	//@FindBy(xpath = "//div[text()='Compose']")
	//private WebElement Compose;
	
	//@FindBy(xpath = "//div[@id=':qf']")
	//private WebElement MessageBody;
	
//	@FindBy(xpath = "//Input[@name='subjectbox']")
	//private WebElement Subject;

	public Pom1(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public void setUsername(WebElement username) {
		Username = username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}

	public WebElement getGoogleApps() {
		return GoogleApps;
	}

	public void setGoogleApps(WebElement googleApps) {
		GoogleApps = googleApps;
	}

	public WebElement getGmail() {
		return Gmail;
	}

	public void setGmail(WebElement gmail) {
		Gmail = gmail;
	}


	
	
	
	
}
