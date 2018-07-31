package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ContextSteps {

    WebDriver driver;

    public ContextSteps(){
        System.setProperty("Webdriver.chrome.driver", "//Users//usachary//Downloads//chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Properties properties = loadProperties("config.properties");
        System.out.println("URL IS ->"+ properties.getProperty("URL"));
        driver.navigate().to(properties.getProperty("URL"));
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void teardown(){
        driver.close();
        driver.quit();
    }

    public Properties loadProperties(String filename){
        Properties properties = new Properties();
        try{
            properties.load(this.getClass().getClassLoader().getResourceAsStream(filename));
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }
        return properties;
    }
}
