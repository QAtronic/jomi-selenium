package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {

    public static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            try {
                URL url = new URL("https://www.google.com/");
                webDriver = new ChromeDriver(DriverUtils.configurationChromeOptions());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return webDriver;
    }

    public static void closeWebDriver() throws IOException {
        webDriver.close();
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
        Runtime rt = Runtime.getRuntime();
        rt.exec("taskkill /im chromedriver.exe /f /t");
    }
}

