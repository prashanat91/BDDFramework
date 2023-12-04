package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class PageFactoryLoginStepsDefination {
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		login = new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);

	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		login.clickOnLoginButton();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
		home = new HomePageFactory(driver);
		home.isCartDisplayed();
		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,
				//"User is navigated to Home Page");
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.close();

	}
}
