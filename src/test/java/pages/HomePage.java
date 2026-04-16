package pages;

import driver.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class HomePage {

    AndroidDriver driver;
    WebDriverWait wait;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    // ✅ Locators
    private By homeTitle = By.id("com.android.settings:id/homepage_title");
    private By searchIcon = By.id("com.android.settings:id/search_action_bar_title");
    private By searchResult = By.id("android:id/search_src_text");

    // ✅ Get title
    public String getHomeTitleText() {
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(homeTitle)
        ).getText();
    }

    // ✅ Click search icon
    public void clickSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(searchIcon)).click();
    }

    // ✅ Enter search text
    public void enterSearchText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResult)).sendKeys(text);
    }
    }
