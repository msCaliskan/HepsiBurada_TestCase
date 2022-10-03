package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public static void verifyUrl(String expectedURL) {
        String actualTitle = Driver.get().getCurrentUrl();
        actualTitle = actualTitle.replace("https://www.hepsiburada.com","");
        Assert.assertEquals(expectedURL,actualTitle);
    }

    public static String verifyMessage(String msg){
        String msg_Loc = Driver.get().findElement(By.xpath("//*[text()='"+msg+"']")).getText();
        BrowserUtils.waitFor(2);

        return msg_Loc;
    }

}
