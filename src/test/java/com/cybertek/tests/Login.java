package com.cybertek.tests;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LogInPage;
import com.cybertek.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test(groups = "regression")
    public void testName() {
        LogInPage.open();
        LogInPage.login();
     //   HomePage.ClickCRM();
      //  HomePage.MagniffierIcone.click();
       // Assert.assertTrue(HomePage.GroupByButton.isDisplayed());
   }
}
