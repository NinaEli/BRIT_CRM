package com.cybertek.tests.BRIT_1147_FilteringFunction;

import com.cybertek.pages.HomePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Pages;
import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BRIT_1148 extends TestBase {
    BRIT_1148(){
        PageFactory.initElements(Driver.getDriver(), Pages.class);
    }

    @BeforeMethod
    public void setuplogin(){
        new BRIT_1148();
        pages.loginPage().open();
        pages.landingPage().clickDemobtn();
        pages.loginPage().managerLogin();
        // BrowserUtils.verifyElementDisplayed(pages.homePage().CRMButton);
        pages.homePage().ClickCRM();
    }

   @Test
    public void testDropdaown(){
     //  extentLogger = report.createTest("BRIT_1148_Test the GroupBy button");
       pages.searchPage().MagniffierIcone.click();
     //  Assert.assertTrue(pages.searchPage().GroupByButton.isDisplayed());
       BrowserUtils.verifyElementDisplayed(pages.searchPage().GroupByButton);

   }



   //test Link button
   @Test
   public void testListOption(){
      new BRIT_1148();
       //  extentLogger = report.createTest("BRIT_1148_Test the GroupBy button");
       pages.searchPage().ListButton.click();
       //tabel will display on the page
      Assert.assertTrue(pages.searchPage().tableDisplay.isDisplayed());
   }

   //test documentation
   @Test
    public void testDocumantation(){
        new BRIT_1148();
        pages.searchPage().Usernamedisplays.click();
        pages.searchPage().documentation.click();
        Assert.assertEquals(driver.getTitle(),"Odoo");

    }

   @Test
    public void testGrapghbtn(){
       new BRIT_1148();
       pages.searchPage().Graghbtn.click();
       Assert.assertTrue(pages.searchPage().measure.isDisplayed());
   }

    @Test
    public void testsupport(){
        new BRIT_1148();
        pages.searchPage().Usernamedisplays.click();
        pages.searchPage().supportbtn.click();
        Assert.assertEquals(driver.getTitle(),"Odoo");
    }
//    @Test
//    public void testPivot(){
//        new BRIT_1148();
//        pages.searchPage().pivot.click();
//        Assert.assertTrue(pages.searchPage().pivotTable.isDisplayed());
//    }



}
