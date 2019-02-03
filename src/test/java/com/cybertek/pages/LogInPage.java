package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static @FindBy(xpath = "//a[contains(text(),'BriteErpDemo')]")
    WebElement DemoSelector;

    public static @FindBy(id = "login")
    WebElement userName;

    public static @FindBy(id = "password")
    WebElement passWord;

    public static @FindBy(xpath = "//b[contains(text(),'Sign in')]")
    WebElement signinBtn;

    public static  @FindBy(xpath = "//button[@type='submit']")
    WebElement logInBtn;



    public static void open() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        DemoSelector.click();
    }

    public static void login() {

        signinBtn.click();
        userName.sendKeys(ConfigurationReader.getProperty("ManagerEmail"));
        passWord.sendKeys(ConfigurationReader.getProperty("ManagerPassword"));
        logInBtn.click();

    }


}
