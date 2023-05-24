package com.Step_Definition;

import org.openqa.selenium.Keys;

import com.Base_Class.BaseClass;
import com.Pom_Class.Pom1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	Pom1 p1 = new Pom1(driver);
	
	@Given("user Opens the Google Page")
	public void user_opens_the_google_page() {
		driver.get("https://www.google.com/");
	  
	}

	@Given("the user click on the SignIn mail")
	public void the_user_click_on_the_sign_in_mail() {
	   Click(p1.getLoginGmail());
	}

	@When("the user enters the username")
	public void the_user_enters_the_username() throws InterruptedException {
		Sendkeys(p1.getUserName(), "Composeincubyte23"+Keys.ENTER);
		Thread.sleep(6000);
	}
	
	

	@When("the user enters the password")
	public void the_user_enters_the_password() throws InterruptedException {
	   Sendkeys(p1.getPassword(), "testmail23"+Keys.ENTER);
	   Thread.sleep(3000);
	   
	}
	
	@When("user sets a Verification method")
	public void user_sets_a_verification_method() throws InterruptedException {
	    Click(p1.getMsgVerify());
	    Thread.sleep(9000);
	    
	}
	
	
	@When("the user navigate to GooglePage")
	public void the_user_navigate_to_google_page() {
	   navigateTo("https://www.google.com/");
	}
	
	
	
	@When("the user searches on googlemail")
	public void the_user_searches_on_googlemail() {
		Sendkeys(p1.getSearchGmail(),"Gmail"+Keys.ENTER);
	   
	}

	@When("the user click on SignIn")
	public void the_user_click_on_sign_in() {
		Click(p1.getClickGooglemail());
		Click(p1.getSelectSignIn());
	   
	}
	
	@When("click on the user")
	public void click_on_the_user() throws InterruptedException {
	    Click(p1.getUser());
	    Thread.sleep(5000);
	}

	@When("the user click on the Compose Mail button")
	public void the_user_click_on_the_compose_mail_button() throws InterruptedException {
	    Click(p1.getComposeMail());
	    Thread.sleep(4000);
	}

	@When("the user wants to type a messaage in the Body")
	public void the_user_wants_to_type_a_messaage_in_the_body() throws InterruptedException {
	  Sendkeys(p1.getMessageBody(), "Automation QA test for Incubyte");
	    Thread.sleep(3000);

	}

	@When("the user wants to add a Subject to the Message")
	public void the_user_wants_to_add_a_subject_to_the_message() {
	 Sendkeys(p1.getMessageSubject(), "Incubyte");  
	}


	@Then("user check the result")
	public void user_check_the_result() {
	   
	}



	
	
}
