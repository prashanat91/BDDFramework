/*package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination {
	static WebDriver driver;

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/");
	}

	//@When("User enters valid username and password")
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {

	//public void user_enters_valid_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		}
	
	@And("Click on Login Button")
	public void click_on_login_button() {
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to Home Page");
	}

	@And("Close the browser")
	public void close_the_browser() {
	   driver.close();

	}
}*/
