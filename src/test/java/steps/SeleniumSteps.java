package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import customTypes.Flight;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Browser;

import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SeleniumSteps {

    Browser browser = new Browser();

    @Given("^the user is on \"([^\"]*)\" page$")
    public void theUserIsOnPage(String url) throws Throwable {
        browser.getDriver().get(url);
        assertThat(browser.getDriver().getCurrentUrl(), containsString(url));
        Thread.sleep(2000);
    }


    @When("^the user searches for \"([^\"]*)\"$")
    public void theUserSearchesFor(String text) throws Throwable {
        browser.getDriver().findElement(By.name("q")).sendKeys(text);
        Thread.sleep(2000);
        browser.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("^the page presents some valid results$")
    public void thePagePresentsSomeValidResults() throws Throwable {
        Thread.sleep(2000);
        assertThat(browser.getDriver().findElement(By.name("q")).getAttribute("value"), containsString("xablablau"));
    }

    @After("@Selenium")
    public void closeBroswer(){
        browser.getDriver().quit();
    }

    @Given("^I have some data$")
    public void iHaveSomeData(List<Flight> flights) throws Throwable {
        flights.forEach((k)-> System.out.println("Passagero: "+ k.getPassengers()));
    }

    @Given("^I have \"([^\"]*)\" as a date$")
    public void iHaveAsADate(@Transform(DateTransformer.class)Date date) throws Throwable {
        System.out.println("DATA:"+date);
    }
}
