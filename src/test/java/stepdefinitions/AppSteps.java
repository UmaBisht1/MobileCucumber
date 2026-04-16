package stepdefinitions;

import driver.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import base.BaseTest;
import io.cucumber.java.en.Then;
import pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import utils.LoggerUtil;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppSteps {

    @Given("user launches the mobile app")
    public void launchApp() {
        System.out.println("App launched successfully");
    }

    @When("user searches for {string}")
    public void user_searches_for(String text) {

        HomePage homePage = new HomePage(DriverManager.getDriver());

        homePage.clickSearch();
        homePage.enterSearchText(text);

        LoggerUtil.logger.info("User searched for: " + text);
    }

    @Then("results should be displayed")
    public void results_should_be_displayed() {

        HomePage homePage = new HomePage(DriverManager.getDriver());

//       boolean isResultDisplayed = homePage.enterSearchText();
//
//        LoggerUtil.logger.info("Search result displayed: " + enterSearchText);
//
//        assertTrue("Search results not displayed", isResultDisplayed);
    }


    @Then("verify settings title is displayed")
    public void verify_settings_title_is_displayed() {
        HomePage homePage = new HomePage(DriverManager.getDriver());
        String actualTitle = homePage.getHomeTitleText();
        System.out.println("Actual Title: " + actualTitle);
        assertEquals("Settings", actualTitle); // expected text
    }
}