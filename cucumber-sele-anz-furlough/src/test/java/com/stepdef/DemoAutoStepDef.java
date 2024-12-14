package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutoStepDef 

{
	WebDriver driver;
	
	@Given(": Open the demo automation website")
	public void open_the_demo_automation_website() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.automationtesting.in/Register.html");

//	    throw new io.cucumber.java.PendingException();
	}

	@When(": User needs to enter first name and hit enter")
	public void user_needs_to_enter_first_name_and_hit_enter() throws InterruptedException {
		WebElement fName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//fName.click();
		fName.sendKeys("abc");
		Thread.sleep(1000);
		
//	    throw new io.cucumber.java.PendingException();
	}

	@When(": User needs to enter last name and hit enter")
	public void user_needs_to_enter_last_name_and_hit_enter() throws InterruptedException {
		WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		//fName.click();
		lName.sendKeys("xyz");
		Thread.sleep(1000);
//	    throw new io.cucumber.java.PendingException();
	}

	@Then(": User enters the Email address")
	public void user_enters_the_email_address() throws InterruptedException {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abc@xyz.com");
		Thread.sleep(1000);
//	    throw new io.cucumber.java.PendingException();
	}

	@And(": User clicks on Submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		WebElement submitBtn = driver.findElement(By.id("submitbtn"));
		submitBtn.click();
		Thread.sleep(1000);
//	    throw new io.cucumber.java.PendingException();
	}

	@Then(": Login breaks and the Browser is closed")
	public void login_breaks_and_the_browser_is_closed() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
//	    throw new io.cucumber.java.PendingException();
	}


}
