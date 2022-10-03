package com.hepsiburada.pages;

import com.hepsiburada.utilities.BrowserUtils;
import com.hepsiburada.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class CategoryAndProductPage extends BasePage {

    @FindBy(xpath = "//*[@data-test-id='product-card-image-container']") public List<WebElement> prodList_Loc;

    @FindBy(xpath = "//*[@id='css-tab-buttons']//td[3]") public WebElement degerlendirmelerTab_Loc;

    @FindBy(xpath = "(//*[@class='thumbsUp hermes-ReviewCard-module-lOsa4wAwncdp3GgzpaaV'])[1]") public WebElement yesButton_Loc;

    public void clickProductRandom(){

        Random rn = new Random();
        int a = rn.nextInt(prodList_Loc.size());

        BrowserUtils.waitFor(1);
        BrowserUtils.hover(prodList_Loc.get(a));
        BrowserUtils.waitFor(1);
        prodList_Loc.get(a).click();
        BrowserUtils.waitFor(1);
    }

    public void clickDegerlendirmelerButton(){
        BrowserUtils.getWindowHandle();
        BrowserUtils.waitForClickablility(degerlendirmelerTab_Loc,5);

            BrowserUtils.clickWithJS(degerlendirmelerTab_Loc);
            BrowserUtils.waitFor(1);

    }

    public void clickYesButton(){
        BrowserUtils.waitForClickablility(yesButton_Loc,5);
        yesButton_Loc.click();
        BrowserUtils.waitFor(1);
    }
}