package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void initializeDriver() {
        new BrowserDriver();
    }

//    @After
//    public void teardown() {
//        BrowserDriver.driver.quit();
//    }
}
