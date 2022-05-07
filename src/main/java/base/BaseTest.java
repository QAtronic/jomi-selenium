package base;

import nav.Navigation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.HomePage;
import pages.LoginPage;
import setup.DriverManager;
import utils.ExplicitWaitConfig;
import utils.ImplicitWaitConfig;

import java.io.IOException;

public class BaseTest {

    public Navigation navigation = new Navigation();
    public HomePage homePage = new HomePage();


    @BeforeEach
    public void setup() {
        DriverManager.getWebDriver();
    }


    @AfterEach
    public void teardown() throws IOException {
        setup.DriverManager.closeWebDriver();
    }
}
