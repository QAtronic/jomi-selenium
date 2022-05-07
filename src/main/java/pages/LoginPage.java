package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(css = "input[name='username']")
    private WebElement usernameInput;
    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;
    @FindBy(css = ".btn.btn-block.btn-default.btn-lg")
    private WebElement loginBtn;

    public HomePage doLogin() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginBtn.click();
        return new HomePage();
    }

}
