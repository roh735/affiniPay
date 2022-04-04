package com.affiniPay.pages;

import com.affiniPay.utilities.Driver;
import com.affiniPay.utilities.NotUseless;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;

public abstract class MainMenu {
    //--PageFactoryMainMenus--------------------------------------------------------------------------------------------
    public MainMenu(){PageFactory.initElements(Driver.getDriver(),this);}

    //--Declaring things------------------------------------------------------------------------------------------------
    public static Map<String, WebElement> uMenuList = new HashMap<>();
    public static NotUseless notUseless = new NotUseless();


//__
//  \__Find Elements MainMenu___________________________________________________________________________________________

    @FindBy(id = "logo")
    public WebElement logoHome;
    //--MainMenus-------------------------------------------------------------------------------------------------------
    @FindBy(id = "features-menu-parent")                            //==============================//
    public WebElement feaMenu;                                      //  Features Element            //
    @FindBy(id = "integrations-menu-parent")                        //                              //
    public WebElement parMenu;                                      //  Partners Element            //
    @FindBy(id = "whoWeServe-menu-parent")                          //                              //
    public WebElement solMenu;                                      //  Solutions Element           //
    @FindBy(id = "support-menu-parent")                             //                              //
    public WebElement supMenu;                                      //  Support Element             //
    @FindBy(id = "about-menu-parent")                               //                              //
    public WebElement aboMenu;                                      //  About Element               //
    @FindBy(linkText = "\n" +                                       //                              //
            "            Contact Us\n" +                            //                              //
            "          ")                                           //                              //
    public WebElement conMenu;                                      //  Contact Us Element          //
    @FindBy(linkText = "\n" +                                       //                              //
            "              Schedule a Demo\n" +                     //                              //
            "            ")                                         //                              //
    public WebElement demoMenu;                                     //  Schedule A Demo Element     //
    @FindBy(linkText = "\n" +                                       //                              //
            "              Log In\n" +                              //                              //
            "            ")                                         //                              //
    public WebElement logInMenu;                                    //  LogIn                       //
                                                                    //==============================//
//--FeaturesUnderMenu's-------------------------------------------------------------------------------------------------
    @FindBy(linkText = "Payments")                                  //==============================//
    public static WebElement paymentsFUM;                           //  PaymentsFUM                 //
    @FindBy(linkText = "Reporting")                                 //                              //
    public static WebElement reportingFUM;                          //  ReportingFUM                //
    @FindBy(linkText = "Security and Compliance")                   //                              //
    public static WebElement securityFUM;                           //  SecurityFUM                 //
    @FindBy(linkText = "Integrations")                              //                              //
    public static WebElement integrationsFUM;                       //  IntegrationsFUM             //
    @FindBy(linkText = "The AffiniPay Difference")                  //                              //
    public static WebElement differenceFUM;                         //  DifferenceFUM               //
    @FindBy(linkText = "Schedule a Demo")                           //                              //
    public static WebElement demoFUM;                               //  DemoFUM                     //
                                                                    //==============================//
//--SupportUnderMenu's--------------------------------------------------------------------------------------------------
    @FindBy(linkText = "Support Tools")                             //======================================//
    public static WebElement supportToolsSUM;                       //  Support Tools                       //
    @FindBy(linkText = "Help Center")                               //                                      //
    public static WebElement helpCenterSUM;                         //  Help Center                         //
    @FindBy(linkText = "Schedule Training")                         //                                      //
    public static WebElement trainingSUM;                           //  Schedule Training                   //
    @FindBy(linkText = "Videos")                                    //                                      //
    public static WebElement videoSUM;                              //  Videos                              //
    @FindBy(linkText = "FAQ")                                       //                                      //
    public static WebElement faqSUM;                                //  FAQ                                 //
                                                                    //======================================//
//--AboutUnderMenu's----------------------------------------------------------------------------------------------------
    @FindBy(linkText = "Our Story")                               //==============================================//
    public static WebElement storyAUM;                            //  Our Story                                   //
    @FindBy(linkText = "News")                                    //                                              //
    public static WebElement newsAUM;                             //  News                                        //
    @FindBy(linkText = "Blog")                                    //                                              //
    public static WebElement blogAUM;                             //  Blog                                        //
    @FindBy(linkText = "Refer A Colleague")                       //                                              //
    public static WebElement referAUM;                            //  Refer A Colleague                           //
    @FindBy(linkText = "Contact Us")                              //                                              //
    public static WebElement contactAUM;                          //  Contact Us                                  //
                                                                  //==============================================//
//  __End Find Elements MainMenu________________________________________________________________________________________
//_/
//__
//  \__Map for underMenusOptions________________________________________________________________________________________

    public static Map<String,WebElement> getuMenuList(){

//--------------------FeaturesUnderMenus--------------------------------------------------------------------------------
        uMenuList.put("PaymentsFUM", paymentsFUM);
        uMenuList.put("ReportingFUM", reportingFUM);
        uMenuList.put("SecurityFUM",securityFUM);
        uMenuList.put("IntegrationsFUM", integrationsFUM);
        uMenuList.put("DifferenceFUM", differenceFUM);
        uMenuList.put("DemoFUM", demoFUM);

//--------------------SupportUnderMenus---------------------------------------------------------------------------------
        uMenuList.put("SupportSUM", supportToolsSUM);
        uMenuList.put("HelpSUM", helpCenterSUM);
        uMenuList.put("TrainingSUM", trainingSUM);
        uMenuList.put("VideosSUM", videoSUM);
        uMenuList.put("FaqSUM", faqSUM);

//--------------------AboutUnderMenus-----------------------------------------------------------------------------------
        uMenuList.put("StoryAUM", storyAUM);
        uMenuList.put("NewsAUM", newsAUM);
        uMenuList.put("BlogAUM", blogAUM);
        uMenuList.put("ReferAUM", referAUM);
        uMenuList.put("ContactAUM", contactAUM);

        return uMenuList;
    }
//  ___END underMenusOptions________________________________________________________________________________
//_/





}
