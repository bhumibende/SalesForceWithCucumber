package cucumber_practice_stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdefinition {

	WebDriver driver;
	

@Given("url https:\\/\\/www.salesforce.com")
public void url_https_www_salesforce_com() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
}

@Given("user id is entered")
public void user_id_is_entered() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.id("username")).sendKeys("bhumi@tekarch.com");
   System.out.println("Test");
}

@When("password field is cleared")
public void password_field_is_cleared() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys("");
	System.out.println("Test");
}

@When("login button is clicked")
public void login_button_is_clicked() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("Login")).click();
	System.out.println("Test");
}

@Then("error message -please enter your password is displayed")
public void error_message_please_enter_your_password_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Test");
}	

@When("valid user password is entered")
public void valid_user_password_is_entered() {
 // Write code here that turns the phrase above into concrete actions
	WebDriver driver = null;
	driver.findElement(By.id("password")).sendKeys("Abhay@242411");
}


@When("remember me checkbox is selected")
public void remember_me_checkbox_is_selected() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("forgot_password_link")).click();
	
}
@Given("url")
public void url() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
}


@Given("invalid user id is entered")
public void invalid_user_id_is_entered() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("username")).sendKeys("123");
	   System.out.println("Test"); 
}

@When("invalid user password is entered")
public void invalid_user_password_is_entered() {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.id("password")).sendKeys("22131");
}

@Then("user should get login unsuccessfully error message")
public void user_should_get_login_unsuccessfully_error_message() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Your login attempt has failed. The username or password may be incorrect, or your location or login time may be restricted. Please contact the administrator at your company for help");
}

	
}
