import base.BaseTest;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHeader() {
        navigation.openMainPage();
        homePage.verifyHeaderText();
    }

    @Test
    public void verifyHeaderButtons() {
        navigation.openMainPage();
        homePage.verifyHeaderButtons();
    }

    @Test
    public void verifyBody() {
        navigation.openMainPage();
        homePage.verifyBody();
    }

    @Test
    public void verifyNews() {
        navigation.openMainPage();
        homePage.verifyRecentNews();
    }

    @Test
    public void verifyFooter() {
        navigation.openMainPage();
        homePage.verifyFooter();
    }

    @Test
    public void verifyFooterLinks() {
        navigation.openMainPage();
        homePage.verifyFooterLinks();
    }
}
