package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	//public static WebDriver driver;

	/*
	@Given("Launch the Browser")
	public void launchTheBrowser() {
		driver = new ChromeDriver();

	}

	@Given("Load the application url")
	public void loadTheApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

*/
	@Given("Enter Username as {string}")
	public void enterUsernameAsDemosalesmanager(String user) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(user);
	}

	@Given("Enter password as  {string}")
	public void enterPasswordAs(String pass) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
	}


	@Given("Entering password as {string}")
	public void enteringPasswordAsCrmsfa1(String pass1) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass1);
	}


	@When("Click on Login button")
	public void clickOnLoginButton() {
		WebElement btnLogin = driver.findElement(By.className("decorativeSubmit"));
		btnLogin.click();
	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {
		WebElement btn1Login = driver.findElement(By.xpath("//div[@id='label']/a"));
		btn1Login.click();


		String title = driver.getTitle();

		if (title.contains("My Home")) {

			System.out.println("Home page is Loaded");

		} else {

			System.out.println("Home page is not Loaded");

		}
	}


}
