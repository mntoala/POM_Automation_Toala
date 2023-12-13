package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
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
    public Boolean isCartPageDisplayed(){
        return isElementDisplayed(checkoutButton);
    }
    public void removeProductsToCart(){
        clickOnElement(removeP1);
        clickOnElement(removeP2);
        clickOnElement(removeP3);
    }
    public int nRemovedProducts(){
        List<WebElement> removedCartItems = driver.findElements(By.className("removed_cart_item"));
        return removedCartItems.size();
    }
    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

}
