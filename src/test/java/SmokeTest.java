import base.BaseTest;
import org.junit.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void mainPage() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyElements();
    }

    @Test
    public void keywords() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyKeywords();
    }

    @Test
    public void params() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyParams();
    }

    @Test
    public void executions() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyExecutions();
    }

    @Test
    public void grid() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyGrid();
    }

    @Test
    public void admin() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .verifyAdmin();
    }

    @Test
    public void logout() {
        navigation.openMainPage();
        loginPage
                .doLogin()
                .logout();
    }

}
