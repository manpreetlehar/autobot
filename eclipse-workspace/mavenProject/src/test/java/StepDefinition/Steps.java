package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Steps {
	WebDriver driver;
	@Given("^Open the Chrome and launch the application$")
	public WebDriver open_the_Chrome_and_launch_the_application() throws Throwable {
	   driver=new ChromeDriver();
	   driver.get("http://www.qaclickacademy.com/");
	   return driver;
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
	    driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	    driver.findElement(By.id("user_email")).sendKeys("aaaa");
	    driver.findElement(By.id("user_password")).sendKeys("aaaa");
	    driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary btn-md login-button')]")).click();
	    
	}

	@Then("^User gets log in\\.$")
	public void user_gets_log_in() throws Throwable {
	   System.out.print("Successful");
	}



}
