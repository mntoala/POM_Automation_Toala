package com.globant.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeP1;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement removeP2;
    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement removeP3;
    @FindBy(id = "removed_cart_item")
    private  WebElement removedP;

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public Boolean isCartDisplayed(){
        return isElementDisplayed(checkoutButton);
    }
    public int nRemovedProducts(){
        List<WebElement> removedCartItems = driver.findElements(By.className("removed_cart_item"));
        return removedCartItems.size();
    }
    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getRemoveP1() {
        return removeP1;
    }
    public WebElement getRemoveP2() {
        return removeP2;
    }
    public WebElement getRemoveP3() {
        return removeP3;
    }

}
