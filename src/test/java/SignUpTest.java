import base.BaseTest;
import org.junit.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void signUp() {
        navigation.openMainPage();
        homePage
                .closePopUp()
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
