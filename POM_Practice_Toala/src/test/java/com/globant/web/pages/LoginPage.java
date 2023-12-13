package com.globant.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    WebDriver driver;
    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void enterUserName(String firstName) {
        username.sendKeys(firstName);
    }

    public void enterPassword(String psw) {
        password.sendKeys(psw);
    }

    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver=driver;
        this.driver.get(url);
    }
    public Boolean isLoginDisplayed(){
        return isElementDisplayed(loginButton);
    }
    public WebElement getLoginButton() {
        return loginButton;
    }
}
