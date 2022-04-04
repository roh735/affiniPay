package com.affiniPay.step_definitions;

import com.affiniPay.pages.FooterElements;
import com.affiniPay.utilities.BrowserUtils;
import com.affiniPay.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class footerCheckerStepDef extends FooterElements {

//__
//  \__Find Footer Elements_____________________________________________________________________________________________
    //--Map<exiName,String[actName,actLink]>----------------------------------------------------------------------------
    Map<String, String[]> footerMenuDataMap = new HashMap<>();

    //--actStrings------------------------------------------------------------------------------------------------------
    int ftl = 3;
    int policyTotal = 2;
    int btnTotal = 2;
    int phoneTotal = 2;
    int phoneTitles = 2;
    int menuRows = 4;
    int menuBtns = 18;
    String facebookLink = "https://www.facebook.com/apforassociations";
    String twitterLink = "http://www.twitter.com/affinipay";
    String linkedinLink = "https://www.linkedin.com/company/affinipay-for-associations/";
    String footerPolicyOne = "AffiniPay LLC is a registered agent of Wells Fargo Bank N.A., Concord, CA, Synovus Bank, Columbus, GA., and Fifth Third Bank, N.A., Cincinnati, OH.";
    String footerPolicyTwo = "Privacy Policy  |  Accessibility Statement";
    String demoContactMenuFooterOne = "SCHEDULE A DEMO";
    String demoContactMenuFooterTwo = "CONTACT US";
    String phoneNumbersFooterOne = "800-485-6455";
    String phoneNumbersFooterTwo = "855-656-4685";
    String salesAndSupportFooterOne = "Sales: 800-485-6455";
    String salesAndSupportFooterTwo = "Support: 855-656-4685";
    String fourTotalRowMenuFooterOne = "Features\nPayments\nReporting\nSecurity and Compliance\nIntegrations\nThe AffiniPay Difference\nSchedule a Demo";
    String fourTotalRowMenuFooterTwo = "Partners";
    String fourTotalRowMenuFooterThree = "Support\nSupport Tools\nHelp Center\nSchedule a Training\nVideos\nFAQ";
    String fourTotalRowMenuFooterFour = "About\nOur Story\nNews\nBlog\nCareers\nRefer A Colleague\nContact Us";
    String[] menuLinks = {"https://www.affinipayassociations.com/payments/","https://www.affinipayassociations.com/reporting/",
            "https://www.affinipayassociations.com/security-compliance/","https://www.affinipayassociations.com/integrations/",
            "https://www.affinipayassociations.com/affinipay-difference/","https://www.affinipayassociations.com/features/schedule-a-demo/",
            "https://www.affinipayassociations.com/partners/","https://www.affinipayassociations.com/support/","https://supportcenter.affinipay.com/hc/en-us",
            "https://affinipay.com/support/schedule-a-training-session/","https://www.affinipayassociations.com/support/videos/",
            "https://www.affinipayassociations.com/support/faq/","https://www.affinipayassociations.com/about/our-story/",
            "https://www.affinipayassociations.com/about/news/","https://www.affinipayassociations.com/about/blog/",
            "https://www.affinipay.com/jobs/#job-postings","https://www.affinipayassociations.com/about/refer-a-colleague/",
            "https://www.affinipayassociations.com/support/contact-us/"};

    //--featureMethod---------------------------------------------------------------------------------------------------
    @When("User should be able to see footer")
    public void user_should_be_able_to_see_footer() {

        System.out.println("\\\\________________________________                   ________________________________//");
        System.out.println("//                                Footer Test Running                                \\\\");
        System.out.println("\\\\________________________________                   ________________________________//");

        //--archOnFooter------------------------------------------------------------------------------------------------
        BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath("//footer")));

        //--ifAllDisplayed?---------------------------------------------------------------------------------------------
        companyLogoFooter.isDisplayed();
        companyPartnerOneFooter.isDisplayed();
        companyPartnerTwoFooter.isDisplayed();
        companyPartnerThreeFooter.isDisplayed();
        companyPartnerFourFooter.isDisplayed();
        companyPartnerFiveFooter.isDisplayed();

        //--ifAllListsDisplayed?----------------------------------------------------------------------------------------
        looperForChecker(ftlLinksFooter);
        looperForChecker(policyInfoFooter);
        looperForChecker(demoContactMenuFooter);
        looperForChecker(phoneNumbersFooter);
        looperForChecker(salesAndSupportFooter);
        looperForChecker(fourTotalRowMenuFooter);
        looperForChecker(allMenuLinksFooter);

        //--ifFacebook\twitter\linkedin-total-3EML----------------------------------------------------------------------
        assertEquals(ftlLinksFooter.size(), ftl);

        //--ifFacebook\twitter\linkedinDisplayed-checker----------------------------------------------------------------
        assertEquals(ftlLinksFooter.get(0).getAttribute("href"), facebookLink);
        assertEquals(ftlLinksFooter.get(1).getAttribute("href"), twitterLink);
        assertEquals(ftlLinksFooter.get(2).getAttribute("href"), linkedinLink);
        System.out.println("Facebook\\Twitter\\Linkedin -" + ftl + " links are displayed and urls working ok...");

        //--ifPolicy-total-2EML-----------------------------------------------------------------------------------------
        assertEquals(policyInfoFooter.size(),policyTotal);

        //--ifPolicyDisplayed-checker-----------------------------------------------------------------------------------
        assertEquals(policyInfoFooter.get(0).getText(),footerPolicyOne);
        assertEquals(policyInfoFooter.get(1).getText(),footerPolicyTwo);
        System.out.println("Policy is Displayed...");

        //--ifBtn-total-2EML--------------------------------------------------------------------------------------------
        assertEquals(demoContactMenuFooter.size(),btnTotal);

        //--ifPolicyDisplayed-checker-----------------------------------------------------------------------------------
        assertEquals(demoContactMenuFooter.get(0).getText(),demoContactMenuFooterOne);
        assertEquals(demoContactMenuFooter.get(1).getText(),demoContactMenuFooterTwo);
        System.out.println("Two BTN'S " + demoContactMenuFooterOne + " and " + demoContactMenuFooterTwo + " is Displayed");

        //--ifPhoneNumbers-total-2EML-----------------------------------------------------------------------------------
        assertEquals(phoneNumbersFooter.size(),phoneTotal);

        //--ifPhone'sDisplayed-checker----------------------------------------------------------------------------------
        assertEquals(phoneNumbersFooter.get(0).getText(),phoneNumbersFooterOne);
        assertEquals(phoneNumbersFooter.get(1).getText(),phoneNumbersFooterTwo);
        System.out.println("Phone numbers is Displayed...");

        //--ifPhoneTitles-total-2EML------------------------------------------------------------------------------------
        assertEquals(salesAndSupportFooter.size(),phoneTitles);

        //--ifPhoneTitle'sDisplayed-checker-----------------------------------------------------------------------------
        assertEquals(salesAndSupportFooter.get(0).getText(),salesAndSupportFooterOne);
        assertEquals(salesAndSupportFooter.get(1).getText(),salesAndSupportFooterTwo);
        System.out.println("Phone titles is Displayed...");

        //--ifMenuRows-total-4EML---------------------------------------------------------------------------------------
        assertEquals(fourTotalRowMenuFooter.size(),menuRows);

        //--ifEachRowIsDisplayed-checker--------------------------------------------------------------------------------
        assertEquals(fourTotalRowMenuFooter.get(0).getText(),fourTotalRowMenuFooterOne);
        assertEquals(fourTotalRowMenuFooter.get(1).getText(),fourTotalRowMenuFooterTwo);
        assertEquals(fourTotalRowMenuFooter.get(2).getText(),fourTotalRowMenuFooterThree);
        assertEquals(fourTotalRowMenuFooter.get(3).getText(),fourTotalRowMenuFooterFour);
        System.out.println(menuRows + " rows of menu is Displayed...");


        //--ifMenuBtn's-total-2EML--------------------------------------------------------------------------------------
        assertEquals(allMenuLinksFooter.size(),menuBtns);

        //--Register-Each-Menu-TextName-In-Map<actName,[exiName,exiLink[eachLink]]>-----------------------------------------------
        footerMenuDataMap.put("Payments", new String[]{getAllMenuNameListFooter().get(0), menuLinks[0]});
        footerMenuDataMap.put("Reporting", new String[]{getAllMenuNameListFooter().get(1), menuLinks[1]});
        footerMenuDataMap.put("Security and Compliance", new String[]{getAllMenuNameListFooter().get(2), menuLinks[2]});
        footerMenuDataMap.put("Integrations", new String[]{getAllMenuNameListFooter().get(3), menuLinks[3]});
        footerMenuDataMap.put("The AffiniPay Difference", new String[]{getAllMenuNameListFooter().get(4), menuLinks[4]});
        footerMenuDataMap.put("Schedule a Demo", new String[]{getAllMenuNameListFooter().get(5), menuLinks[5]});
        footerMenuDataMap.put("Partners", new String[]{getAllMenuNameListFooter().get(6), menuLinks[6]});
        footerMenuDataMap.put("Support Tools", new String[]{getAllMenuNameListFooter().get(7), menuLinks[7]});
        footerMenuDataMap.put("Help Center", new String[]{getAllMenuNameListFooter().get(8), menuLinks[8]});
        footerMenuDataMap.put("Schedule a Training", new String[]{getAllMenuNameListFooter().get(9), menuLinks[9]});
        footerMenuDataMap.put("Videos", new String[]{getAllMenuNameListFooter().get(10), menuLinks[10]});
        footerMenuDataMap.put("FAQ", new String[]{getAllMenuNameListFooter().get(11), menuLinks[11]});
        footerMenuDataMap.put("Our Story", new String[]{getAllMenuNameListFooter().get(12), menuLinks[12]});
        footerMenuDataMap.put("News", new String[]{getAllMenuNameListFooter().get(13), menuLinks[13]});
        footerMenuDataMap.put("Blog", new String[]{getAllMenuNameListFooter().get(14), menuLinks[14]});
        footerMenuDataMap.put("Careers", new String[]{getAllMenuNameListFooter().get(15), menuLinks[15]});
        footerMenuDataMap.put("Refer A Colleague", new String[]{getAllMenuNameListFooter().get(16), menuLinks[16]});
        footerMenuDataMap.put("Contact Us", new String[]{getAllMenuNameListFooter().get(17), menuLinks[17]});

        //--Loop-Checker-if-each[actName[actName,actLink]]-equals-to-each[exiName,exiLink]------------------------------
        float loader = 0;
        for (int i = 0; i < footerMenuDataMap.size(); i++) {
            assertEquals(footerMenuDataMap.get(getAllMenuNameListFooter().get(i))[0],getAllMenuNameListFooter().get(i));
            assertEquals(footerMenuDataMap.get(getAllMenuNameListFooter().get(i))[1],allMenuLinksFooter.get(i).getAttribute("href"));
//            System.out.println(footerMenuDataMap.get(getAllMenuNameListFooter().get(i))[0]);
//            System.out.println(footerMenuDataMap.get(getAllMenuNameListFooter().get(i))[1]);
            System.out.println("Loading " + (int)loader + "%...");
            loader += 5.6;

        }
        System.out.println("Loaded successful 100%");
        System.out.println(menuBtns + " menu options is Displayed...");
        System.out.println("Each name with Link of the menu options is working...");





    }

}
