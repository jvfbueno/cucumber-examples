package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^the user is on login page$")
    public void theUserIsOnLoginPage() throws Throwable {
        System.out.println("The user is on login page step");
    }

    @When("^the user login using valid credentials$")
    public void theUserLoginUsingValidCredentials() throws Throwable {
        System.out.println("The user login using valid credenials");
    }

    @Then("^the dashboard page is displayed$")
    public void theDashboardPageIsDisplayed() throws Throwable {
        System.out.println("The dashboard page is displayed");
    }

    @When("^the user enters the following credential \"([^\"]*)\"$")
    public void theUserEntersTheFollowingCredential(String credential) throws Throwable {
        System.out.println("The credentials are:" + credential);
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Antes de cada step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("Depois de cada step");
    }


    @Before("@Outline")
    public void beforeScenario(){
        System.out.println("Antes de cada cenario");
    }

    @After
    public void afterScenario(){
        System.out.println("Depois de cada cenario");
    }
}
