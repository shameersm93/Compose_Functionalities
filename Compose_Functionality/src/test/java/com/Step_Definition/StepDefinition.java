package com.Step_Definition;

import com.Base_Class.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("user Launch the Gmail Application")
	public void user_launch_the_gmail_application() {
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?ifkv=Af_xneEs2pBUzUSD8rHfkYmcSrQqpJa6SjLTrJao3ZLYD5A5yuCtdWNKbiLZEf62QDd16Yfc3rzU&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	   
	}

	@When("the user enters the username")
	public void the_user_enters_the_username() {
	    
	}

	@When("the user enters the password")
	public void the_user_enters_the_password() {
	   
	}
	
	@When("user click on Google apps icon")
	public void user_click_on_google_apps_icon() {
	    
	}

	@When("the user click on Mail button")
	public void the_user_click_on_mail_button() {
	   
	}

	@When("the user click on the Compose Mail button")
	public void the_user_click_on_the_compose_mail_button() {
	    
	}

	@When("the user wants to type a messaage in the Body")
	public void the_user_wants_to_type_a_messaage_in_the_body() {
	   
	}

	@When("the user wants to add a Subject to the Message")
	public void the_user_wants_to_add_a_subject_to_the_message() {
	    
	}

	@Then("user check the result")
	public void user_check_the_result() {
	   
	}


}
