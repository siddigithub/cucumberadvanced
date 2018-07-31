package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="uid")
    private WebElement textLogin;

    @FindBy(name="password")
    private WebElement textPwd;

    @FindBy(name="btnLogin")
    private WebElement btnLogin;

    public void login(String username, String password){
        textLogin.sendKeys(username);
        textPwd.sendKeys(password);
        btnLogin.click();
    }
}
