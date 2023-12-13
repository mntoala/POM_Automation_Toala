package com.globant.web.pages;

import com.globant.web.utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    private ProductPage productPage= new ProductPage(driver);

    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    public void addProduct1ToCart(){
        clickOnElement(product1);
        Assert.assertTrue(productPage.isProductPageDisplayed());
        clickOnElement(productPage.getAddToCartP1());
        clickOnElement(shoppingCart);
    }
    public void addProductsToCart(){
        clickOnElement(addToCartP1);
        clickOnElement(addToCartP2);
        clickOnElement(addToCartP3);
    }
    public Boolean isInventoryPageDisplayed(){
        return isElementDisplayed(filterProducts);
    }
    public WebElement getShoppingCart() {
        return shoppingCart;
    }

}
