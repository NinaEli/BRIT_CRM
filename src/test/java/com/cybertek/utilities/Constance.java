package com.cybertek.utilities;


import com.cybertek.pages.ButtonInHomePage;
import com.cybertek.pages.HomePage;
import com.cybertek.pages.LogInPage;

public class Constance {

    public static void loginToCRMModule() {



        LogInPage logInPage = new LogInPage();
        logInPage.open();
        logInPage.login();

       HomePage homePage = new HomePage();
        homePage.ClickCRM();


    }
}
