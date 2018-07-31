package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {

    @Given("^I navigate to the registration page$")
    public void given_i_navigate_to_the_registration_page(){
        System.out.println("I navigate to the registration page");
    }

    @When("^I attempt to register with user details$")
    public void when_i_attempt_to_register_with_user_details(){
        System.out.println("I attempt to register with user details");
    }

    @Then("^the registration is sucessfull$")
    public void then_the_registration_is_sucessfull(){
        System.out.println("The registration is successful");
    }
}
