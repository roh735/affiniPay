package com.affiniPay.step_definitions;

import com.affiniPay.pages.MainMenu;
import com.affiniPay.utilities.BrowserUtils;
import com.affiniPay.utilities.ConfigurationReader;
import io.cucumber.java.en.When;

public class partnersStepDef extends MainMenu {
    @When("User at partners page")
    public void userAtContactPage() {
        parMenu.click();
        BrowserUtils.sleep(1);
        notUseless.currentPageTest(ConfigurationReader.getProperty("partnersPage"));

    }
}
