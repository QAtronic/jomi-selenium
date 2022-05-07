package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.DriverManager;

public class ExplicitWaitConfig {
    WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), 15);

    public void waitForRodo(String s) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(s)));
    }

    public void wait(String s) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(s)));
    }

    public void waitForWebelement(WebElement s) {
        wait.until(ExpectedConditions.elementToBeClickable(s));
    }


}
