package Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ContextSteps {

    WebDriver driver;

    public ContextSteps(){
        System.setProperty("Webdriver.chrome.driver", "//Users//usachary//Downloads//chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("http://demo.guru99.com/V4/");
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void teardown(){
        driver.close();
        driver.quit();
    }
}
