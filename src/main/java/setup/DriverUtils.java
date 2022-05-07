package setup;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverUtils {


//    public static DesiredCapabilities configurationCapabilities() {
//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setCapability("chromedriverExecutable",
//                "C:\\Programming\\Projects\\Appium\\src\\main\\resources\\chromedriver.exe");
//        return dc;
//    }

    public static ChromeOptions configurationChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Programming\\statsnet\\src\\main\\resources\\chromedriver.exe");

        options.addArguments("start-maximized");
        return options;
    }
}
