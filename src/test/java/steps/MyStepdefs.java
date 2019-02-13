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




}
