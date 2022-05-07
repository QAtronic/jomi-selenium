package pages;

import base.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.DriverManager;
import utils.ExplicitWaitConfig;
import utils.ImplicitWaitConfig;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {

    public ExplicitWaitConfig explicitWaitConfig = new ExplicitWaitConfig();
    public ImplicitWaitConfig implicitWaitConfig = new ImplicitWaitConfig();

    @FindBy(css = "button#login-button")
    private WebElement signInBtn;
    @FindBy(css = "[href='\\/signup\\?from\\=\\%2F']")
    private WebElement createAnAccountBtn;

    public HomePage clickSignInButton() {
        signInBtn.click();
        return this;
    }

    public SignupPage clickCreateAnAccountBtn() {
        createAnAccountBtn.click();
        return new SignupPage();
    }
}
