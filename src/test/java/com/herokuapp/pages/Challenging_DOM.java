package com.herokuapp.pages;

import com.herokuapp.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class Challenging_DOM {

    public Challenging_DOM() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='button alert']")
    public WebElement redButton;

    @FindBy(xpath = "//a[@class='button']")
    public WebElement blueButton;

    @FindBy(xpath = "//a[@class='button success']")
    public WebElement greenButton;


    public void clickRedButton() {
        redButton.click();
    }

    public void checkIdsAreDifferent() {
        String redId = redButton.getAttribute("id");
        String blueId = blueButton.getAttribute("id");
        String greenId = greenButton.getAttribute("id");

        clickRedButton();

        String redIdCurrent = redButton.getAttribute("id");
        String blueIdCurrent = blueButton.getAttribute("id");
        String greenIdCurrent = greenButton.getAttribute("id");

        Assert.assertNotEquals(redIdCurrent, redId);
        Assert.assertNotEquals(blueIdCurrent, blueId);
        Assert.assertNotEquals(greenIdCurrent, greenId);

    }

}
