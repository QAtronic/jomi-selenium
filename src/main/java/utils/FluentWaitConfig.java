package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import setup.DriverManager;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitConfig {

    FluentWait<WebDriver> fluentWait = new FluentWait<>(DriverManager.getWebDriver())
            .withTimeout(Duration.ofSeconds(45))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

//    public void wait(String s) {
//        fluentWait.until(new Function<AppiumDriver<WebDriver>, WebElement>() {
//            @Override
//            public WebElement apply(AppiumDriver<WebDriver> appiumDriver) {
//                return DriverManager.getWebDriver().findElement(By.cssSelector(s));
//            }
//
//            @Override
//            public <V> Function<V, WebElement> compose(Function<? super V, ? extends AppiumDriver<MobileElement>> before) {
//                return Function.super.compose(before);
//            }
//
//            @Override
//            public <V> Function<AppiumDriver<MobileElement>, V> andThen(Function<? super WebElement, ? extends V> after) {
//                return Function.super.andThen(after);
//            }
//        });
//    }
}
