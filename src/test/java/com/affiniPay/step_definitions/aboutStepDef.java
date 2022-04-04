package com.affiniPay.step_definitions;

import com.affiniPay.pages.MainMenu;
import io.cucumber.java.en.Then;

import java.util.List;

public class aboutStepDef extends MainMenu {
    @Then("User hover about menu and click following:")
    public void userHoverAboutMenuAndClickFollowing(List<String> pageList) {
        notUseless.pagesTest(pageList,aboMenu);
    }
}
