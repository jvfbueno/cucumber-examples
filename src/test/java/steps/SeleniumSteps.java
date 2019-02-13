package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Browser;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SeleniumSteps {

    Browser broswer = new Browser();

    @Given("^the user is on \"([^\"]*)\" page$")
    public void theUserIsOnPage(String url) throws Throwable {
        broswer.getDriver().get(url);
        assertThat(broswer.getDriver().getCurrentUrl(), containsString(url));
        Thread.sleep(2000);
    }


    @When("^the user searches for \"([^\"]*)\"$")
    public void theUserSearchesFor(String text) throws Throwable {
        broswer.getDriver().findElement(By.name("q")).sendKeys(text);
        Thread.sleep(2000);
        broswer.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("^the page presents some valid results$")
    public void thePagePresentsSomeValidResults() throws Throwable {
        Thread.sleep(2000);
        assertThat(broswer.getDriver().findElement(By.name("q")).getAttribute("value"), containsString("teste"));
    }
}
