package com.herokuapp.pages;

import com.herokuapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestPage {
    public TestPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//a[text()='Dynamic Controls']")
    public WebElement dynamic_Controls;

    @FindBy(xpath = "//a[text()='Challenging DOM']" )
    public WebElement challenging_DOM;


    public void userOnTheHerokuPage() {

        Driver.get().get("https://the-internet.herokuapp.com");

    }

    public void clickDynamicControl() {
        dynamic_Controls.click();
    }

    public void clickChallengingDOM(){
        challenging_DOM.click();
    }


}
