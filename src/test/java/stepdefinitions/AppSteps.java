package stepdefinitions;

import io.cucumber.java.en.Given;

public class AppSteps {

    @Given("user launches the mobile app")
    public void launchApp() {
        System.out.println("App launched successfully");
    }
}