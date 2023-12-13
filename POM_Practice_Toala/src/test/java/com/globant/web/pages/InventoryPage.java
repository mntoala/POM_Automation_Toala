package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    @FindBy(className = "select_container")
    private WebElement filterProducts;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCart;
    @FindBy(id = "item_4_title_link")
    private WebElement product1;
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartP1;
    @FindBy(name = "add-to-cart-sauce-labs-bike-light")
    private WebElement addToCartP2;
    @FindBy(name = "add-to-cart-sauce-labs-onesie")
    private WebElement addToCartP3;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    public Boolean isInventoryDisplayed(){
        return isElementDisplayed(filterProducts);
    }
    public WebElement getProduct1() {
        return product1;
    }
    public WebElement getShoppingCart() {
        return shoppingCart;
    }
    public WebElement getAddToCartP1() {
        return addToCartP1;
    }
    public WebElement getAddToCartP2() {
        return addToCartP2;
    }
    public WebElement getAddToCartP3() {
        return addToCartP3;
    }

}
