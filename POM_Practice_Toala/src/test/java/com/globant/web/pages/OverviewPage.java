package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage {
    @FindBy(id = "finish")
    private WebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
    }
    public Boolean isOverviewPageDisplayed(){
        return isElementDisplayed(finishButton);
    }

    public WebElement getFinishButton() {
        return finishButton;
    }
}
