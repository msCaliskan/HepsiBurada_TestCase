package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.ConfigurationReader;
import com.hepsiburada.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@aria-autocomplete='list']") public WebElement searchBox_Loc;

    public void gotoHomePage(){
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(1);
    }

    public static void checkHomePage(){
        String expectedTitle ="Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        BrowserUtils.waitFor(1);
    }

    public void searchBox(String string){
        searchBox_Loc.sendKeys(string+ Keys.ENTER);

        BrowserUtils.waitFor(1);
    }



}
