package com.vtiger.stepdefinations;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinations extends BaseTest


    {
	
	@Before
	
	public void getscenarioName(Scenario scenario)
	{
		TCName=scenario.getName();
		
	}
	
	@After
	public void savereport() 
	{
		extent.flush();
	}
	
	
	
	
	@Given("User should be on login page")
	public void user_should_be_on_login_page() throws IOException, FilloException {
		initiation();
		
		logger = extent.createTest(TCName);
	    
	}
	@When("user perform invalid login")
	public void user_perform_invalid_login() {
	    
		LoginPage lp = new LoginPage(driver);
		lp.login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
		
		
	}
	@Then("user should be validate error message")
	public void user_should_be_validate_error_message() {
		LoginPage lp = new LoginPage(driver);
		lp.verifyErrorMsg();
	}
	
	@When("user perform valid login")
	public void user_perform_valid_login() {
		LoginPage lp = new LoginPage(driver);
		lp.login(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
	    
			
	}

	
	@Then("user should be validate logo")
	public void user_should_be_validate_logo() {
		LoginPage lp = new LoginPage(driver);
		lp.verifyLogo();
		
	}


	
	
	
	@Given("user is on login page")
	 public void user_is_on_login_page() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("http://localhost:100");
	    
	}
	
	@When("User enters valid user id")
	public void user_enters_valid_user_id() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
	}
	
	@When("User enters Invalid user id")
	public void user_enters_Invalid_user_id() {
		driver.findElement(By.name("user_name")).sendKeys("admin123");
	}
	
	@When("enters valid Password")
	public void enters_valid_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");
	    
	}
	
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	    
	
	}
	
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	   driver.findElement(By.linkText("Home")).isDisplayed();
	}
	
	@Then("user should be navigated to login page")
	public void user_should_be_navigated_to_login_page() {
	   driver.findElement(By.name("user_password")).isDisplayed();
	}
	
	@Then("user can see logout link")
	public void user_can_see_logout_link() {
		driver.findElement(By.linkText("Logout")).isDisplayed();
	    
	}
	
	@Then("user can see error message")
	public void user_can_see_error() {
		driver.findElement(By.xpath("//*[contains(text(),'You must specify a valid username and password.')][")).isDisplayed();
	    
	}
	
	@And("close browser")
	public void closebrowser() {
		driver.quit();
	    
	}
	@When("User enters Invalid user id as {string}")
	public void user_enters_invalid_user_id_as(String uid) {
		driver.findElement(By.name("user_name")).clear();
	    driver.findElement(By.name("user_name")).sendKeys(uid);
	}
	
	@And("enters valid Password as {string}")
	public void enters_valid_password_as(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}
	
	@Given("user should be on home page")
	public void user_should_be_on_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost:100");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
		
	}
	
	
		
	}


