package pages;

import base.BasePage;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWaitConfig;
import utils.ImplicitWaitConfig;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {

    public ExplicitWaitConfig explicitWaitConfig = new ExplicitWaitConfig();
    public ImplicitWaitConfig implicitWaitConfig = new ImplicitWaitConfig();

    SoftAssertions softly;

    @FindBy(css = "button#login-button")
    private WebElement signInBtn;
    @FindBy(css = "[href='\\/signup\\?from\\=\\%2F']")
    private WebElement createAnAccountBtn;
    @FindBy(css = "input[name='email']")
    private WebElement mailLoginInput;
    @FindBy(css = "input[name='password']")
    private WebElement passwordLoginInput;
    @FindBy(id = "mui-25")
    private WebElement loginBtn;
    @FindBy(css = ".css-q11fvk [tabindex]")
    private WebElement closePopUpBtn;
    @FindBy(css = ".MuiBox-root.css-164r41r")
    private WebElement logo;
    @FindBy(css = ".MuiInputBase-input")
    private WebElement searchInput;
    @FindBy(css = "h1")
    private List<WebElement> h1Headers;
    @FindBy(css = "h2")
    private List<WebElement> h2Headers;
    @FindBy(css = "h3")
    private WebElement h3Header;
    @FindBy(css = ".MuiBox-root.css-u4p24i > div")
    private List<WebElement> headerButtonList;
    @FindBy(css = ".css-ucs5r7")
    private WebElement blockQuote;
    @FindBy(css = "[decoding]")
    private WebElement imageSrc;
    @FindBy(css = ".MuiBox-root.css-1tfqoz0 > div")
    private List<WebElement> footerDivList;
    @FindBy(css = "div:nth-of-type(2) > a")
    private List<WebElement> footerFirstLinksColumn;
    @FindBy(css = "div:nth-of-type(3) > a")
    private List<WebElement> footerSecondLinksColumn;

    public HomePage clickSignInButton() {
        implicitWaitConfig.normalWait(5000);
        signInBtn.click();
        return this;
    }

    public HomePage closePopUp() {
        implicitWaitConfig.normalWait(5000);
        closePopUpBtn.click();
        return this;
    }

    public SignupPage clickCreateAnAccountBtn() {
        createAnAccountBtn.click();
        return new SignupPage();
    }

    public void doLogin() {
        mailLoginInput.sendKeys("test12@test.com");
        passwordLoginInput.sendKeys("qwe123123");
        loginBtn.click();
    }

    public void verifyHeaderText() {
        assertTrue(logo.isDisplayed());
        assertTrue(searchInput.isDisplayed());
        softly = new SoftAssertions();
        softly.assertThat(logo).isNotNull();
        softly.assertThat(searchInput).isNotNull();
    }

    public void verifyHeaderButtons() {
        for (WebElement i : headerButtonList) {
            assertTrue(i.isDisplayed());
            assertTrue(i.isEnabled());
        }
    }

    public void verifyBody() {
        headers(h1Headers);
        headers(h2Headers);
    }

    public void verifyRecentNews() {
        softly = new SoftAssertions();
        softly.assertThat(h3Header.getText()).isEqualTo("Recent News");
        softly.assertThat(blockQuote).isNotNull();
        boolean checked = isAttributePresent(imageSrc, "src");
        assertTrue(checked);
    }

    public void verifyFooter() {
        softly = new SoftAssertions();
        for (WebElement i : footerDivList) {
            softly.assertThat(i).isNotNull();
        }
    }

    public void verifyFooterLinks() {
        softly = new SoftAssertions();
        for (WebElement i : footerFirstLinksColumn) {
            assertTrue(isAttributePresent(i, "a"));
        }
        for (WebElement i : footerSecondLinksColumn) {
            assertTrue(isAttributePresent(i, "a"));
        }
    }

    private void headers(List<WebElement> list) {
        softly = new SoftAssertions();
        for (WebElement i : list) {
            softly.assertThat(i.getText()).isNotNull().isNotEmpty();
        }
    }

    private boolean isAttributePresent(WebElement element, String attribute) {
        boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
