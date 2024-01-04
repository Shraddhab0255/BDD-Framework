package com.vtiger.stepdefinations;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.codoid.products.exception.FilloException;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class LeadStepDefinations extends BaseTest

	    {
	
		
		@Given("user perform valid loginpage")
		public void user_perform_valid_login() throws InterruptedException {
			
			LeadPage lp = new LeadPage(driver);
			lp.loginpage(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
		    
		}
		
		@When("user click on new lead link") 
		public void user_click_on_new_lead_link() throws IOException, FilloException, InterruptedException {
        LeadPage lp = new LeadPage(driver);
		lp.clickonnewleadlink();
			
		
		 }
		@When("fill the valid data")
		public void fill_the_valid_data() {
			LeadPage lp = new LeadPage(driver);
			lp.createLead(dt.get(TCName).get("FirstName"), dt.get(TCName).get("LastName"), dt.get(TCName).get("Company"));
		    	
			
		}
		@When("click on save button")
		public void click_on_save_button() {
			driver.findElement(By.name("save")).click();
		 	    
		}
		    
		       
		@Then("user should be navigated to lead page")
		public void user_should_be_navigated_to_lead_page() {
			LeadPage lp = new LeadPage(driver);
			lp.verifyelementtoExist();
		}
		
	
		@When("user click on new lead link and fill the data and click on save button")
		public void user_click_on_new_lead_link_and_fill_the_data_and_click_on_save_button() {
			LeadPage lp = new LeadPage(driver);
			lp.loginpage(dt.get(TCName).get("Userid"), dt.get(TCName).get("Password"));
			lp.clickonnewleadlink();
			lp.createLead(dt.get(TCName).get("FirstName"), dt.get(TCName).get("LastName"), dt.get(TCName).get("Company"));
			driver.findElement(By.name("save")).click();
					
		}
		

		@Then("user click on New Task and fill the data and click on save button.")
		public void user_click_on_new_task_and_fill_the_data_and_click_on_save_button() throws InterruptedException {
		    LeadPage lp = new LeadPage(driver);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500)");
		    lp.clickonnewtask(dt.get(TCName).get("Subject"), dt.get(TCName).get("StartDate"),dt.get(TCName).get("Time"), dt.get(TCName).get("DropDown"), dt.get(TCName).get("Status"), dt.get(TCName).get("DueDate"));
		    driver.findElement(By.name("save")).click();
		    
		}
		    
	   @Then("user should be navigated to new task")
	   public void user_should_be_navigated_to_new_task() {
		   LeadPage lp = new LeadPage(driver);
			lp.verifyelementtoExist();
	   }





}
