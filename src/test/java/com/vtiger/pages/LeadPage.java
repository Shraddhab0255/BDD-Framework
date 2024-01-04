package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.common.commonMethods;

public class LeadPage {
	
	public WebDriver driver;
	public commonMethods cm;
	
	
	public LeadPage(WebDriver driver)
	{
		this.driver = driver;		
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver);
	}
	
	@FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[normalize-space()='New Lead']")
	WebElement newlead;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@name='button']")
	WebElement savebutton;
	
    @FindBy(xpath="//td[@class='moduleTitle']")
    WebElement leadtitle;
    
   // @FindBy(xpath="//input[@name='Delete [Alt+D]']")
    //WebElement delete;
    
    
    @FindBy(xpath="//input[@name='user_name']")
	WebElement username1;
	
	@FindBy(xpath="//input[@name='user_password']")
	WebElement password1;
	
	@FindBy(xpath="//input[@name='Login']")
	WebElement login1;
	
	@FindBy(xpath="//a[normalize-space()='New Lead']")
	WebElement newlead1;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname1;
	
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname1;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company1;
	
	@FindBy(xpath="//input[@name='button']")
	WebElement savebutton1;
    
    @FindBy(xpath="//input[@title='New Task']")   
    WebElement newtask;
    
    @FindBy(xpath="//input[@name='subject']")
    WebElement subjecttext;
    
    @FindBy(xpath="//input[@id='jscal_field_date_start']")
    WebElement sdate;
    
    @FindBy(xpath="//input[@name='time_start']\r\n"+ "")
    WebElement timevalue;
    
    @FindBy(xpath="(//select[@name='parent_type'])[2]")
    WebElement selectvalue;
    
    @FindBy(xpath="//input[@title='Change [Alt+G]']")
    WebElement changebutton;
    
    @FindBy(linkText="(//a[@href='a'])[10]")
    WebElement linktext;
    
    @FindBy(xpath="//select[@name='taskstatus']")
    WebElement text;
    
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement checkboxClick;
    
    @FindBy(xpath="(//input[@type='radio'])[2]")
    WebElement MouseClick;
    
    @FindBy(xpath="//input[@name='due_date']")
    WebElement ddate;
    
    @FindBy(xpath="//input[@title='Save [Alt+S]']")
    WebElement save;
    
    
    public void loginpage(String userid, String pwd)
	{
		cm.enterValue(username, userid, "username entered successfully");
		
		cm.enterValue(password, pwd, "Password entered succesfully");
		cm.clickElement(login, "Login button clicked");
	}
    
    public void clickonnewleadlink()
    {
    	
    	cm.clickElement(newlead,"clicked on New lead suceessfully");
    	
    }
	
	public void createLead(String fname, String lname, String elm)
	{
		
		cm.enterValue(firstname, fname , "First Name entered successfully");
		cm.enterValue(lastname,lname,"Last Name entered successfully");
		cm.enterValue(company, elm, "company Name entered successfully");
		cm.clickElement(savebutton, "Save button clicked");
		
		
		//cm.clickElement(delete, "Lead deleted successfully");
		

}

	
	public void verifyelementtoExist() {
		
		cm.elementExist(leadtitle," Lead is visible successfully");
		
		

	}
	
	
	 public void loginpage1(String userid, String pwd)
		{
			cm.enterValue(username1, userid, "username entered successfully");
			
			cm.enterValue(password1, pwd, "Password entered succesfully");
			cm.clickElement(login1, "Login button clicked");
		}
	 
	 public void createLead1(String fname, String lname, String elm)
		{
			
			cm.enterValue(firstname, fname , "First Name entered successfully");
			cm.enterValue(lastname,lname,"Last Name entered successfully");
			cm.enterValue(company, elm, "company Name entered successfully");
			cm.clickElement(savebutton, "Save button clicked");
		}
	 
	 
	public void clickonnewtask(String subject, String startdate,String time, String elm, String text, String value)
	{
		cm.clickElement(newtask, "clicked on new task successfully");
		cm.enterValue(subjecttext, subject, "subject entered successfully");
		cm.enterValue(sdate, startdate, "startdate entered successfully");
        cm.enterValue(timevalue,time, "time entered successfully");
        cm.selectDropdownText(selectvalue, elm, "Potentials seleted successfully");
        cm.clickElement(changebutton, "Clicked Sucessfully");
        cm.switchtowindow(1, "Clicked on change button succesfully");
        cm.selectDropdownText(selectvalue, text, "elm seleted sucessfully");
        cm.MouseClick(checkboxClick, "elm Selected sucessfully");
        cm.MouseClick(MouseClick, "team seleted sucessfully");
        cm.enterValue(ddate, elm, "Due Date selected sucessfully");
       
      
	}

		


	
	
}
	
	
	



