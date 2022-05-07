package nav;

import setup.DriverManager;

public class Navigation implements URL {

    public void openMainPage( ){
        DriverManager.getWebDriver().navigate().to(URL.MAIN_PAGE);

    }
}
