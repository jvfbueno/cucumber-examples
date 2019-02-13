package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import customTypes.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;

import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DemoSteps {

    Browser browser = new Browser();

    @Given("^the user is on login page$")
    public void theUserIsOnLoginPage() throws Throwable {
        browser.getDriver().get("http://automationpractice.com/index.php");
        assertThat(browser.getDriver().getCurrentUrl(), containsString("http://automationpractice.com/index.php"));
        browser.getDriver().findElement(By.className("login")).click();
        assertThat(browser.getDriver().getCurrentUrl(), containsString("http://automationpractice.com/index.php?controller=authentication&back=my-account"));
    }

    @When("^the user enter valid credentials$")
    public void theUserEnterValidCredentials() throws Throwable {
        browser.getDriver().findElement(By.id("email")).sendKeys("o12087206@nwytg.net");
        browser.getDriver().findElement(By.id("passwd")).sendKeys("123456");
        browser.getDriver().findElement(By.id("SubmitLogin")).click();
    }

    @Then("^the my account page is displayed$")
    public void theMyAccountPageIsDisplayed() throws Throwable {
        browser.waitFor(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
        assertThat(browser.getDriver().getCurrentUrl(), containsString("http://automationpractice.com/index.php?controller=my-account"));
    }




    @Given("^the user is logged in$")
    public void theUserIsLoggedIn() throws Throwable {
        browser.getDriver().get("http://automationpractice.com/index.php?controller=my-account");

    }

    @When("^the user searches for an item$")
    public void theUserSearchesForAnItem(List<Item> items) throws Throwable {
        items.forEach((k)-> System.out.println("Item name: "+k.getName()+" Item price: "+k.getPrice()));
    }

    @Then("^then the user adds the item to cart$")
    public void thenTheUserAddsTheItemToCart() throws Throwable {

    }



    @After
    public void closeBrowser(){
        //browser.getDriver().quit();
    }

    @Before("@Login")
    public void loginUser(){
        Date date = new Date(Long.parseLong("1551831293000"));
        Cookie cookie = new Cookie("PrestaShop-a30a9934ef476d11b6cc3c983616e364",
                "AcCrjFJfZHXlExHvNOO8jxbPe%2FlC%2FVeua4LyVKkIEfKuVGa61504FBDvu5sOuHUr7d97yINe6lVNz3rLvYkF%2BLiM9mTVW5hjsSJSJ6RIfozlIiSNm3wg9SXurj8BiUfq9qOXv1tz%2F4iPzWL33IiLEiAkoc4ahxDCATDe6jw9IfZgEvys8lCi3U1uscBsuasFGHLBG6H3F5dvdxfE5nzJlK%2BJALKLex8KRSEs%2BLwoMJ5gXP%2BMqwVi09aVynxkQ%2BDkjdEs3LcyxfC2Spu0mCb3UHfiikFwsNL%2BtV5SCVhcmmQwHShuvbGz5xV9i12g0%2FXfQwUb5WnOXjLaI%2FQ1QsqkhbCu%2F7SyTUMF%2BqUk8FUQvnbqgXHJCQQ%2FtZLgyzUukRAl35l7f3zaVHCjywv4eYN%2FjCurTAGPkk3yzm3TXJy3eB8%3D000310",
                ".automationpractice.com",
                "/",
                new Date(Long.parseLong("1551817930000"))
        );
        browser.getDriver().get("http://automationpractice.com/index.php");
        browser.getDriver().manage().addCookie(cookie);
        //browser.getDriver().quit();
    }
}
