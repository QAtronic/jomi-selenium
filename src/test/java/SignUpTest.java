import base.BaseTest;
import org.junit.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void mainPage() {
        navigation.openMainPage();
        homePage
                .clickSignInButton()
                .clickCreateAnAccountBtn()
                .fillAllInputs()
                .verifySocialButtons()
                .verifyText()
                .confirmRegistration()
                .verifyRegistrationModal()
                .verifyButtonAndProceed();
    }
}
