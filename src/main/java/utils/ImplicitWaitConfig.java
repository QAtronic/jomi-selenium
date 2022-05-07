package utils;


import setup.DriverManager;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitConfig {

    public void normalWait(long l) {
        DriverManager.getWebDriver().manage().timeouts().implicitlyWait(l, TimeUnit.MILLISECONDS);
    }
}
