package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	@Given("^Open the chrome and launch the application$")
	public void open_the_chrome_and_launch_the_application() throws Throwable {
		System.out.println("open chrome");
		System.out.println("open chrome");	
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		System.out.println("give username and password");
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		System.out.println("give credential");
	}

}
