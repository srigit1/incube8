package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("deprecation")
public class SignInPage {


	@FindBy(xpath="//*[@id=\"imdbHeader\"]/div[2]/div[5]/a")
	WebElement signInLink;

	@FindBy(xpath="//a[text()='Create a New Account']")
	WebElement createNewAccount;

	@FindBy(id="ap_customer_name")
	WebElement customerName;

	@FindBy(id="ap_email")
	WebElement customerEmail;

	@FindBy(id="ap_password")
	WebElement customerPassword;

	@FindBy(id="ap_password_check")
	WebElement customerRePassword;

	@FindBy(id="continue")
	WebElement createAccount;

	@FindBy(xpath="//span[contains(text(),'Sign in with IMDb')]")
	WebElement signinExistingUser;

	@FindBy(id="signInSubmit")
	WebElement signinButton;


	@FindBy(xpath="//*[@id=\"imdbHeader\"]/div[2]/div[5]/div/label[2]/div/span")
	WebElement profileMenu;


	@FindBy(xpath="//a[@class='ipc-list__item imdb-header-account-menu__sign-out']")
	WebElement signoutLink;




	public SignInPage(WebDriver driver){

		PageFactory.initElements(driver, this);
	}


	//This method naviagtes to create new Account Page

	public void createNewAccount() throws InterruptedException
	{

		Thread.sleep(3000);
		signInLink.click();
		createNewAccount.click();
	}

	//In this ,new user will gets registered
	public void fillDetails(String name,String email) throws InterruptedException
	{
		
		customerName.sendKeys(name);
		customerEmail.sendKeys(email);
		customerPassword.sendKeys("test@123");
		customerRePassword.sendKeys("test@123");
		createAccount.click();
		profileMenu.click();
		signoutLink.click();
	}

	//This method navigates  to the signin page for existing user
	public void signInExistingUser() throws InterruptedException
	{
		Thread.sleep(2000);
		signInLink.click();
		signinExistingUser.click();
	}

	//This method verifies login to the application for new user created
	public void verifyNewUserSignIn(String email) throws InterruptedException {


		customerEmail.sendKeys(email);
		customerPassword.sendKeys("test@123");
		signinButton.click();

	}

}
