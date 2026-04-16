package base;

import driver.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

import java.net.URL;

public class BaseTest {

    public static void initializeDriver() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", ConfigReader.get("platformName"));
        caps.setCapability("deviceName", ConfigReader.get("deviceName"));
        caps.setCapability("automationName", ConfigReader.get("automationName"));
        caps.setCapability("appPackage", ConfigReader.get("appPackage"));
        caps.setCapability("appActivity", ConfigReader.get("appActivity"));

        AndroidDriver driver = new AndroidDriver(
                new URL(ConfigReader.get("url")),
                caps
        );
        DriverManager.setDriver(driver);
    }
}