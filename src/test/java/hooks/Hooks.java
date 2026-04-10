package hooks;

import base.BaseTest;
import driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup() throws Exception {
        BaseTest.initializeDriver();
    }

    @After
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}