import base.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        navigation.openMainPage();
        homePage
                .clickSignInButton()
                .doLogin();
    }
}
