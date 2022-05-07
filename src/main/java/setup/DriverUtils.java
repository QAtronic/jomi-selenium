package setup;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {

    public static ChromeOptions configurationChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:\\Programming\\jomi\\src\\main\\resources\\chromedriver.exe");

        options.addArguments("start-maximized");
        return options;
    }
}
