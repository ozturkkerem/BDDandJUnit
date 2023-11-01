package com.herokuapp.pages;

import com.herokuapp.utilities.CommonMethods;
import com.herokuapp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dynamic_Page {

    public Dynamic_Page(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//button[text()='Remove']")
    public WebElement remove_Button;

    @FindBy (xpath = "//p[@id='message']")
    public WebElement itIsGoneMessage;

    public void clickRemoveButton(){
        remove_Button.click();
    }

    public void checkItIsGoneMessage(){
        CommonMethods.clickElementExpWait(itIsGoneMessage);
        Assert.assertTrue(itIsGoneMessage.isDisplayed());

    }


}
