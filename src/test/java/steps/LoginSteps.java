package steps;

import Base.ContextSteps;
import Page.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {

    //mngr145901
    //EnamYdE

    private ContextSteps contextSteps;
    private HomePage homePage;

    //Pico container injects the class context steps.
    public LoginSteps(ContextSteps contextSteps){
        this.contextSteps = contextSteps;
        String url = contextSteps.getDriver().getTitle();
        System.out.println("URL:->" + url);
    }

    @Given("^I navigate to the login page$")
    public void given_i_navigate_to_the_login_page(){
        System.out.println("I navigate to the login page");
        homePage = new HomePage(contextSteps.getDriver());
        homePage.login("mngr145901", "EnamYdE");

//        contextSteps.getDriver().findElement(By.name("uid")).sendKeys("mngr145901");
//        contextSteps.getDriver().findElement(By.name("password")).sendKeys("EnamYdE");
//        contextSteps.getDriver().findElement(By.name("btnLogin")).click();
//        WebDriver driver = contextSteps.getDriver();
//
//        String url = driver.getTitle();
//        System.out.println("Title of page is ->"+ url);
    }

    @When("^I attempt to login with username and password$")
    public void when_i_lgin_with_username_and_password(){
        System.out.println("I login with username and password");
    }

    @Then("^I can see the welcome screen$")
    public void then_i_can_see_the_welcome_screen(){
        System.out.println("I can see the welcome screen");
        contextSteps.teardown();
    }
}
