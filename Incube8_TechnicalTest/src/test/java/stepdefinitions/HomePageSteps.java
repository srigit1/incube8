package stepdefinitions;

import commons.Init;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;

public class HomePageSteps {
	
	
	HomePage hpage;
	
		  
	@Given("^User navigates to IMDb home page$")
	public void user_is_on_the_IMDb_home_page() throws Throwable {
		
			 System.out.println("User is on the home page");
	}

	@When("^Menu button is clicked$")
	public void menu_button_is_clicked() throws Throwable {
		
		HomePage hpage=new HomePage(Init.driver);
		System.out.println("driver" +Init.driver);
		hpage.clickMenu();
	}

	@When("^Top Rated Shows Link is selected$")
	public void top_Rated_Shows_Link_is_selected() throws Throwable {
		
		HomePage hpage=new HomePage(Init.driver);
		hpage.clickTopRatedShowsLink();
	}
	
	

	@When("^Search for \"([^\"]*)\" and  select ‘Game of Thrones: The LastWatch’ link from the suggestion window$")
	public void search_for_Game_of_thrones_and_select_Game_of_Thrones_The_LastWatch_link_from_the_suggestion_window(String input) throws Throwable {
		HomePage hpage=new HomePage(Init.driver);
		hpage.searchwithInput(input);
	}
	
	@Then("^episode title,ratings and reviews should be displayed$")
	public void episode_title_ratings_and_reviews_should_be_displayed() throws Throwable {
	  
		HomePage hpage=new HomePage(Init.driver);
		hpage.verifyEpisodeTitle();
		hpage.verifyRatingAndReviews();
	    
	}
	
	@When("^user logsout$")
    public void logout()
    {
		Init.driver.quit();
    }
	
}
