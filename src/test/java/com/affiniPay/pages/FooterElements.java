package com.affiniPay.pages;

import com.affiniPay.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class FooterElements{

    //--PageFactoryMainMenus------------------------------------------------------------------------------------------------
    public FooterElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//__
//  \__Declaring things_____________________________________________________________________________________________
    //--LogoMenu--------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[@data-src='/assets/static/associations-logo-white.63cb1fb.6bd69a4f04057eeb3b224784b84335f1.svg']")
    public WebElement companyLogoFooter;

    //--PartnerOne------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[@data-src='/assets/static/bestplacestowork.8094b0d.e6a22ed9029a42451834c8a61b7de370.png']")
    public WebElement companyPartnerOneFooter;

    //--PartnerTwo------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[2]")
    public WebElement companyPartnerTwoFooter;

    //--PartnerThree----------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[3]")
    public WebElement companyPartnerThreeFooter;

    //--PartnerFour-----------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[4]")
    public WebElement companyPartnerFourFooter;

    //--PartnerFive-----------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//footer/div/div/div/img[5]")
    public WebElement companyPartnerFiveFooter;

    //--facebook\twitter\linkedin-elements------------------------------------------------------------------------------
    public List<WebElement> ftlLinksFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/div[1]/div/a"));

    //--PolicyElements--------------------------------------------------------------------------------------------------
    public List<WebElement> policyInfoFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/div[1]/p"));

    //--btnElements-----------------------------------------------------------------------------------------------------
    public List<WebElement> demoContactMenuFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/div[2]/a"));

    //--phoneElements---------------------------------------------------------------------------------------------------
    public List<WebElement> phoneNumbersFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/div[3]/p/a"));

    //--sales\supportElements--------------------------------------------------------------------------------------------
    public List<WebElement> salesAndSupportFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/div[3]/p"));

    //--allRowsElements-------------------------------------------------------------------------------------------------
    public List<WebElement> fourTotalRowMenuFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/ul"));

    //--eachMenuInRowElements-------------------------------------------------------------------------------------------
    public static List<WebElement> allMenuLinksFooter = Driver.getDriver().findElements(By.xpath("//footer/div/div/ul/li/a"));

    //--Map[Name,WebElement]--------------------------------------------------------------------------------------------
//    public static Map<String, WebElement> allMenuLinksMapFooter = new HashMap<>();
//    public static Map<String, WebElement> getAllMenuLinksMapFooter(){
//        for (int i = 0; i < allMenuLinksFooter.size(); i++) {                                                         // This can be used as well
//            allMenuLinksMapFooter.put(allMenuLinksFooter.get(i).getText(),allMenuLinksFooter.get(i));                 // Map<Name,WebElement>
//        }                                                                                                             // If delete footerMenuDataMap
//        return allMenuLinksMapFooter;
//    }

    //--List[Name]------------------------------------------------------------------------------------------------------
    public static List<String> allMenuLinksNAMEFooter = new ArrayList<>();
    public static List<String> getAllMenuNameListFooter(){
        for (int i = 0; i < allMenuLinksFooter.size(); i++) {                                                           // Just I can do it
            allMenuLinksNAMEFooter.add(allMenuLinksFooter.get(i).getText());                                            // List<Name>
        }                                                                                                               // Without .get(i).getText
        return allMenuLinksNAMEFooter;                                                                                  // ;)
    }

    //--looperForIsDisplayedMethod-ToRunWithList------------------------------------------------------------------------
    public static void looperForChecker(List<WebElement> elmn){
        for (int i=0; i < elmn.size(); i++){
            elmn.get(i).isDisplayed();
        }
    }




}
