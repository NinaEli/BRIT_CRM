package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonInHomePage {


    public ButtonInHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Advanced Search...']")
    public WebElement searchMagnificationBtn;

    @FindBy(xpath = "//body[@class='o_web_client']/div[@class='o_main']/div[@class='o_main_content']/div[@class='o_control_panel']/div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button[1]")
    public WebElement filterBtn;

    @FindBy(xpath = "//li[@data-index='0']//a[@href='#'][contains(text(),'Draft')]")
    public WebElement draft_btn;





}
