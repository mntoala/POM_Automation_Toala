package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    public void enterLogin(String name, String psw){
        username.sendKeys(name);
        password.sendKeys(psw);
        clickOnElement(loginButton);
    }

    public LoginPage(WebDriver driver, String url){
        super(driver);
        this.driver=driver;
        this.driver.get(url);
    }
    public Boolean isLoginPageDisplayed(){
        return isElementDisplayed(loginButton);
    }
    public WebElement getLoginButton() {
        return loginButton;
    }
}
