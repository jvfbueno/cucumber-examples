package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;

import java.util.Date;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class SeleniumSteps {

    Browser browser = new Browser();

    @Given("^the user is on \"([^\"]*)\" page$")
    public void theUserIsOnPage(String url) throws Throwable {
        browser.getDriver().get(url);
        assertThat(browser.getDriver().getCurrentUrl(), containsString(url));
    }




}
