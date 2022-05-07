package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignupPage extends HomePage {

    @FindBy(css = "input[name='firstName']")
    private WebElement firstNameInput;
    @FindBy(css = "input[name='lastName']")
    private WebElement lastNameInput;
    @FindBy(css = "input[name='email']")
    private WebElement emailInput;
    @FindBy(css = "input[name='phoneNumber']")
    private WebElement phoneNumberInput;
    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordInput;
    @FindBy(css = ".MuiBox-root.css-1ebprri > p")
    private List<WebElement> informationList;
    @FindBy(css = "h4")
    private WebElement header;
    @FindBy(css = ".css-1wfpbbb > button")
    private List<WebElement> socialList;
    @FindBy(css = "[class='css-1nnhfy8'] button")
    private WebElement signUpBtn;
    @FindBy(css = "[role='dialog']")
    private WebElement dialog;
    @FindBy(css = "input[name='institution_name']")
    private WebElement institutionNameInput;
    @FindBy(css = "input[name='inst_email']")
    private WebElement institutionMailInput;
    @FindBy(css = "ul > li")
    private List<WebElement> dialogList;
    @FindBy(css = "#user_type")
    private WebElement userType;
    @FindBy(css = "ul > li:nth-of-type(3)")
    private WebElement specialityIndex;
    @FindBy(css = "div:nth-of-type(4) > .MuiFormControl-fullWidth.MuiFormControl-root.css-tzsjye > .MuiInputBase-colorPrimary.MuiInputBase-formControl.MuiInputBase-fullWidth.MuiInputBase-root.MuiInputBase-sizeSmall.MuiOutlinedInput-root.css-4lnewr")
    private WebElement speciality;
    @FindBy(css = ".MuiDialogActions-root.MuiDialogActions-spacing.css-14b29qc > button")
    private List<WebElement> dialogBtnList;
    @FindBy(css = "#notistack-snackbar")
    private WebElement stackBar;

    Faker faker = new Faker();

    public SignupPage fillAllInputs() {
        explicitWaitConfig.wait("input[name='firstName']");
        firstNameInput.sendKeys(faker.name().firstName());
        lastNameInput.sendKeys(faker.name().lastName());
        emailInput.sendKeys(faker.internet().emailAddress());
        phoneNumberInput.sendKeys("123123123");
        passwordInput.sendKeys("qwe123123");
        confirmPasswordInput.sendKeys("qwe123123");
        return this;
    }

    public SignupPage verifyText() {
        for (WebElement i : informationList) {
            assertThat(i.getText()).isNotNull();
        }
        assertThat(header.getText()).isEqualTo("Create an Account");
        return this;
    }

    public SignupPage verifySocialButtons() {
        for (WebElement i : socialList) {
            assertTrue(i.isEnabled());
            assertTrue(i.isDisplayed());
        }
        return this;
    }

    public SignupPage confirmRegistration() {
        signUpBtn.click();
        return this;
    }

    public SignupPage verifyRegistrationModal() {
        implicitWaitConfig.normalWait(10000);
        assertTrue(dialog.isDisplayed());
        institutionNameInput.sendKeys(faker.chuckNorris().fact());
        institutionMailInput.sendKeys(faker.internet().emailAddress());
        userType.click();
        iterateList();
        speciality.click();
        specialityIndex.click();
        return this;
    }


    public void verifyButtonAndProceed() {
        for (WebElement i : dialogBtnList) {
            assertTrue(i.isDisplayed());
            assertTrue(i.isEnabled());
        }
        dialogBtnList.get(1).click();
        implicitWaitConfig.normalWait(4000);
        assertTrue(stackBar.isDisplayed());
    }

    private void iterateList() {
        for (WebElement i : dialogList) {
            assertTrue(i.isDisplayed());
            assertTrue(i.isEnabled());
        }
        dialogList.get(1).click();
    }

}
