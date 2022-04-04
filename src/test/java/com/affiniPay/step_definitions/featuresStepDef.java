package com.affiniPay.step_definitions;

import com.affiniPay.pages.FooterElements;
import com.affiniPay.pages.MainMenu;
import com.affiniPay.utilities.ConfigurationReader;
import com.affiniPay.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class featuresStepDef extends MainMenu {
    @Given("User at home page")
    public void userAtHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));

    }

    @Then("User hover features menu and click following:")
    public void userHoverProductMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList,feaMenu);
    }

    @When("User clicks on Logo with link to home page")
    public void userAtFeaturesPage() {
        logoHome.click();
        notUseless.currentPageTest(ConfigurationReader.getProperty("homePage"));

    }
}
