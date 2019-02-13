package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.sql.Time;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

public class Browser {

    WebDriver driver;
    ConditionalWait wait;

    public WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
            wait = new ConditionalWait(driver);
        }
        return driver;
    }

    public void waitFor(ExpectedCondition waitCondition){
        wait.byExpectedCondition(waitCondition);
    }

}


class ConditionalWait {

    private Wait wait;


    ConditionalWait(WebDriver driver) {
        wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(0,1 ))
                .ignoring(NoSuchElementException.class);
    }

    public void byExpectedCondition(ExpectedCondition waitCondition) {
        wait.until(waitCondition);
    }

}