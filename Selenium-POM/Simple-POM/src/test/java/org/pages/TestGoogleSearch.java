package org.pages;

import org.automation.browser.Browser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by shantonu on 3/12/16.
 */
public class TestGoogleSearch {
    private GooglePage google = null;

    WebDriver aBrowser = null;

    @Before
    public void init(){
        //aBrowser =new FirefoxDriver();
        aBrowser = Browser.getInstance("firefox");
        google = new GooglePage(aBrowser);
    }

    @Test
    public void testCancelSearch(){
        Assert.assertEquals("Google", google.openPage().getTitle());
        Assert.assertEquals("Title =>","Google Doodles", google.clickImFeelingLuckyButton().getTitle());

    }

    @Test
    public void searchAnItem(){
        String searchText = "Shantonu";
        google.typeOnSearchText(searchText);
        google.clickSearchLink();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Title After Search=>",searchText+" - Google Search", aBrowser.getTitle());
        //google.clickSearchLink();
       // google.typeOnSearchText("I am typing an item");
       // google.clickSearchLink();
        //Assert.assertEquals("Title After Search=>",searchText+" - Google Search", google.clickSearchLink().getTitle());
    }

    @After
    public void cleanup(){
       // Browser.close();
    }
}
