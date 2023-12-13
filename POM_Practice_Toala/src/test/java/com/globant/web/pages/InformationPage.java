package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(className = "checkout_info")
    private  WebElement infoCard;
    @FindBy(id = "continue")
    private  WebElement continueButton;


    public InformationPage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String name) {
        firstName.sendKeys(name);
    }
    public void enterLastName(String name) {
        lastName.sendKeys(name);
    }
    public void enterPostalCode(String code) {
        postalCode.sendKeys(code);
    }
    public void enterInformationPage(String firstName, String lastName, String postalCode){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickOnElement(continueButton);
    }
    public Boolean isInformationPageDisplayed(){
        return isElementDisplayed(infoCard);
    }

}
