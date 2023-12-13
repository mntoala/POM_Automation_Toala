package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage {
    @FindBy(className = "complete-header")
    private WebElement header;

    public SuccessPage(WebDriver driver) {
        super(driver);
    }
    public String getTextToValidate(){
        return header.getText();
     }
}
