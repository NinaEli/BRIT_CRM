package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public static  @FindBy(xpath = "//span[@class='oe_menu_text'][contains(text(),'CRM')]")
    WebElement CRMButton;

    //=======elements on the left=========
    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[14]/span")
    WebElement pipelinePipelineElement;

    static public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[15]/span")
    WebElement pipelineQuotationsElement;

    static public @FindBy(xpath ="(//a[@class='oe_menu_leaf']//span)[16]")
    // this second way to find xpath of Customers module
            // (x=path="//div[@class='oe_secondary_menu_section active']//span[@class='oe_menu_text'][contains(text(),'Customers')]")
            WebElement customersElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[17]/span")
    WebElement reportingPipelineElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[18]/span")
    WebElement reportingActivitiesElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[19]/span")
    WebElement reportingSalesChannelsElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[20]/span")
    WebElement configurationSalesChannelsElement;

    static  public @FindBy(xpath = "(//a[@class='oe_menu_leaf'])[21]/span")
    WebElement configurationActivityTypesElement;

    static  public  @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
    WebElement configurationLeadsOpportunitiesElement;

    //===============SeachBox ===============

    public static @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/input")
    WebElement SeachingBox;


    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public static WebElement MagniffierIcone;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public static WebElement FilterButton;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/button")
    public static WebElement GroupByButton;




    public static void ClickCRM(){
        CRMButton.click();
    }
}
