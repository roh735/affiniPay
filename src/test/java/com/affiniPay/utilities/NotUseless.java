package com.affiniPay.utilities;

import com.affiniPay.pages.MainMenu;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotUseless extends MainMenu {


    Map<String,String> urlMap = new HashMap<>();

    public Map<String,String> mapUrlLoader(){
        urlMap.put("PaymentsFUM",ConfigurationReader.getProperty("payments.FUM"));
        urlMap.put("ReportingFUM",ConfigurationReader.getProperty("reporting.FUM"));
        urlMap.put("SecurityFUM",ConfigurationReader.getProperty("security.FUM"));
        urlMap.put("IntegrationsFUM",ConfigurationReader.getProperty("integrations.FUM"));
        urlMap.put("DifferenceFUM",ConfigurationReader.getProperty("difference.FUM"));
        urlMap.put("DemoFUM",ConfigurationReader.getProperty("demo.FUM"));
        urlMap.put("SupportSUM",ConfigurationReader.getProperty("support.SUM"));
        urlMap.put("HelpSUM",ConfigurationReader.getProperty("help.SUM"));
        urlMap.put("TrainingSUM",ConfigurationReader.getProperty("training.SUM"));
        urlMap.put("VideosSUM",ConfigurationReader.getProperty("videos.SUM"));
        urlMap.put("FaqSUM",ConfigurationReader.getProperty("faq.SUM"));
        urlMap.put("StoryAUM",ConfigurationReader.getProperty("story.AUM"));
        urlMap.put("NewsAUM",ConfigurationReader.getProperty("news.AUM"));
        urlMap.put("BlogAUM",ConfigurationReader.getProperty("blog.AUM"));
        urlMap.put("ReferAUM",ConfigurationReader.getProperty("refer.AUM"));
        urlMap.put("ContactAUM",ConfigurationReader.getProperty("contact.AUM"));
        return urlMap;
    }

    //--PageOpenerMethod------------------------------------------------------------------------------------------------
    public void pagesTest(List<String> pageList, WebElement optionMenu){
        homePageReturnerIfDifferent();
        for (String currentPage: pageList) {
            BrowserUtils.hover(optionMenu);
            getuMenuList().get(currentPage).click();
            BrowserUtils.sleep(1);
            currentPageTest(mapUrlLoader().get(currentPage));

        }
    }
    //--CurrentPageCheckerMethod----------------------------------------------------------------------------------------
    public void currentPageTest(String expectedUrl){
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,currentUrl);
    }
    //--HomePageReturnerMethod------------------------------------------------------------------------------------------
    public void homePageReturnerIfDifferent(){
        String pageChecker = Driver.getDriver().getCurrentUrl();
        if (!pageChecker.contains("affinipayassociations.com")){Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));}
    }
}