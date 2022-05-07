package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.DriverManager;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends LoginPage {

    @FindBy(css = "st-actions > div")
    private List<WebElement> rightDiv;
    @FindBy(css = ".nav.navbar-nav > li")
    private List<WebElement> topTabsList;
    @FindBy(css = ".searchheader > th")
    private List<WebElement> searchHeader;
    @FindBy(css = ".nav.nav-tabs > li")
    private List<WebElement> gridTabs;
    @FindBy(css = ".btn.btn-default.btn-xs")
    private WebElement refreshBtn;
    @FindBy(css = "a#sessionDropdown")
    private WebElement userIcon;
    @FindBy(css = ".nav.navbar-nav.navbar-right  .dropdown-menu > .ng-scope")
    private WebElement logout;
    @FindBy(css = ".btn.btn-success")
    private WebElement addBtn;


    public void verifyElements() {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void verifyKeywords() {
        topTabsList.get(1).click();
        verifyElements();
        assertEquals(rightDiv.get(2).getText(), "New keyword");
        assertEquals(rightDiv.get(3).getText(), "New Keyword package");
        for (WebElement e : searchHeader) {
            assertTrue(e.isDisplayed());
        }
    }

    public void verifyParams() {
        topTabsList.get(2).click();
        verifyElements();
        assertEquals(rightDiv.get(2).getText(), "New parameter");
        for (WebElement e : searchHeader) {
            assertTrue(e.isDisplayed());
        }
    }

    public void verifyExecutions() {
        topTabsList.get(3).click();
        verifyElements();
        assertTrue(refreshBtn.isDisplayed());
    }

    public void verifyGrid() {
        topTabsList.get(5).click();
        verifyElements();
        for (WebElement e : gridTabs) {
            assertTrue(e.isDisplayed());
            e.click();
        }
        assertTrue(refreshBtn.isDisplayed());
    }

    public void verifyAdmin() {
        topTabsList.get(6).click();
        verifyElements();
        assertEquals(rightDiv.get(0).getText(), "Add user");
    }

    public void logout() {
        verifyElements();
        userIcon.click();
        logout.click();
    }
}
