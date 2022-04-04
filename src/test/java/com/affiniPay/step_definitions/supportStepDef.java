package com.affiniPay.step_definitions;

import com.affiniPay.pages.MainMenu;
import io.cucumber.java.en.Then;

import java.util.List;

public class supportStepDef extends MainMenu {
    @Then("User hover support menu and click following:")
    public void userHoverSupportMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList,supMenu);
    }
}
