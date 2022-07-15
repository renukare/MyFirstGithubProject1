package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionEmp {
	WebDriver driver;
	String actual="";
	@Given("^User navigates to orangehrm url$")
	public void user_navigates_to_orangehrm_url() throws Throwable {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://orangehrm.qedgetech.com");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User logs in username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_logs_in_username_as_and_password_as(String user, String pass) throws Throwable {
	 driver.findElement(By.name("txtUsername")).sendKeys(user);
	 driver.findElement(By.name("txtPassword")).sendKeys(pass);
	 Thread.sleep(2000);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	   Thread.sleep(2000);
	}

	@When("^user click pim button$")
	public void user_click_pim_button() throws Throwable {
	   driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	   Thread.sleep(2000);
	}

	@When("^user click Add Employee button$")
	public void user_click_Add_Employee_button() throws Throwable {
	    driver.findElement(By.linkText("Add Employee")).click();
	    Thread.sleep(2000);
	}

	@When("^user enter fullname as \"([^\"]*)\" and middlename as \"([^\"]*)\" and lastname as \"([^\"]*)\"$")
	public void user_enter_fullname_as_and_middlename_as_and_lastname_as(String fname, String mname, String lname) throws Throwable {
	 driver.findElement(By.name("firstName")).sendKeys(fname);
	 driver.findElement(By.name("middleName")).sendKeys(mname);
	 driver.findElement(By.name("lastName")).sendKeys(lname);
	 Thread.sleep(2000);
	
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable {
	  driver.findElement(By.id("btnSave")).click();
	  Thread.sleep(2000);
	}

	@Then("^user validates url$")
	public void user_validates_url() throws Throwable {
		String actual = "empNumber";
	    String expcted=driver.getCurrentUrl();
	    Thread.sleep(2000);
	    
	    if(expcted.contains(actual))
	    {
	    	System.out.println("Add employee success:"+expcted+"    "+actual);
	    	
	    }
	    else
	    {
	    	System.out.println("Add employee fail:"+expcted+"     "+actual);
	    }
	    		
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
	    driver.close();
	}

}
