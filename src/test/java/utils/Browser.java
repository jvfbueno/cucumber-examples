package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    WebDriver driver;

    public WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

}
