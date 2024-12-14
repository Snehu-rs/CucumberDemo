package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("Print Statement 1 : User is on the login Page");
		//throw new io.cucumber.java.PendingException();
	}

	@When("User enters <username> and <password>")
	public void user_enters_username_and_password() 
	{
		System.out.println("Print Statement 2 : User enters Un and Pwd");
		//throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		System.out.println("Print Statement 3 : User clicks on login button");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
		System.out.println("Print Statement 4 : User is navigated to the home page");
		//throw new io.cucumber.java.PendingException();
	}


}
