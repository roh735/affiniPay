package com.affiniPay.step_definitions;

import com.affiniPay.pages.MainMenu;
import com.affiniPay.utilities.BrowserUtils;
import com.affiniPay.utilities.ConfigurationReader;
import com.affiniPay.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class solutionsStepDef extends MainMenu {
    @When("User at solutions page")
    public void userAtSolutionsPage() {
        solMenu.click();
        BrowserUtils.sleep(1);
        notUseless.currentPageTest(ConfigurationReader.getProperty("solutionsPage"));
    }
}
