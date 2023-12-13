package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBtnPage extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public MenuBtnPage(WebDriver driver) {
        super(driver);
    }
    public Boolean isMenuBtnPageDisplayed(){
        return isElementDisplayed(logoutButton);
    }
    public WebElement getMenuButton() {
        return menuButton;
    }
    public WebElement getLogoutButton() {
        return logoutButton;
    }
}
