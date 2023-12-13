package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{
    @FindBy(id = "finish")
    private WebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    public Boolean isOverviewDisplayed(){
        return isElementDisplayed(finishButton);
    }

    public WebElement getFinishButton() {
        return finishButton;
    }
}
