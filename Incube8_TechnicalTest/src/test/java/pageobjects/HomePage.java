package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePage {
	
	
	
	@FindBy(className="ipc-button__text")
	WebElement menuLink;

	@FindBy(xpath="//*[@id=\'imdbHeader\']/div[2]/aside/div/div[2]/div/div[2]/span/div/div/ul/a[1]")
	WebElement topRatedShowsLink;

	@FindBy(id="suggestion-search")
	WebElement searchBox;

	@FindBy(xpath="//img[@alt='Game of Thrones: The Last Watch']")
	WebElement lastWatchLink;

	@FindBy(xpath="//span[@itemprop='ratingValue']")
	WebElement rating;

	@FindBy(xpath="//span[@itemprop='ratingCount']")
	WebElement noOfReviews;

	@FindBy(xpath="//h1[contains(text(),'Game of Thrones: The Last Watch')]")
	WebElement episodeTitle;


	public HomePage(WebDriver driver){

		PageFactory.initElements(driver, this);
	}

	public void clickMenu()
	{
		menuLink.click();
	}

	public void clickTopRatedShowsLink() throws InterruptedException
	{
		Thread.sleep(2000);
		topRatedShowsLink.click();
	}

	public void searchwithInput(String input) throws InterruptedException
	{
		searchBox.clear();
		searchBox.sendKeys(input);
		Thread.sleep(2000);
		lastWatchLink.click();

	}

	public void verifyEpisodeTitle()
	{
		String title=episodeTitle.getText();
		Assert.assertEquals("Game of Thrones: The Last Watch (2019)",title);

	}

	public void verifyRatingAndReviews()
	{
		String ratingValue=rating.getText();
		Assert.assertEquals("7.2",ratingValue);

		String reviewsCount=noOfReviews.getText();
		Assert.assertEquals("5,263",reviewsCount);
	}





}
