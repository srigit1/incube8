package stepdefinitions;

import commons.Init;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.SignInPage;

public class SignInPageSteps {
	
	

	SignInPage spage;


	@When("^create new account is clicked$")
	public void create_new_account_is_clicked() throws Throwable {
		SignInPage spage=new SignInPage(Init.driver);
		Thread.sleep(4000);
		System.out.println(Init.driver);
		spage.createNewAccount();
	   
	}

	@When("^User fills in all the registration details with \"([^\"]*)\" and \"([^\"]*)\" and submits$")
	public void user_fills_in_all_the_registration_details_with_and_and_submits(String name,String email) throws Throwable {
		SignInPage spage=new SignInPage(Init.driver);
		spage.fillDetails(name,email);
	    
	}

	@Then("^New User Account should be created successfully$")
	public void account_should_be_created() throws Throwable {
		
		System.out.println("account created succesfully");
	    
	}

	
	@When("^signIn is clicked ans signin with Existing IMDB is selected$")
	public void signin_is_clicked_ans_signin_with_Existing_IMDB_is_selected() throws Throwable {
		SignInPage spage=new SignInPage(Init.driver);
		spage.signInExistingUser();
	}

	@When("^User enters \"([^\"]*)\" and pasword  and submits$")
	public void user_enters_and_pasword_and_submits(String email) throws Throwable {
		
		SignInPage spage=new SignInPage(Init.driver);
		spage.verifyNewUserSignIn(email);
	}

	@Then("^Newly Registered User should be able to login to the Application successfully$")
	public void newly_Registered_User_should_be_able_to_login_to_the_Application_successfully() throws Throwable {
	   
		System.out.println("new user is logged in ");
	}




}
