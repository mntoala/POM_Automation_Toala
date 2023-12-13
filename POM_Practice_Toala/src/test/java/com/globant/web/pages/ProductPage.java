package com.globant.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(id = "back-to-products")
    private  WebElement backToProducts;
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartP1;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isProductDisplayed(){
        return isElementDisplayed(backToProducts);
    }

    public WebElement getAddToCartP1() {
        return addToCartP1;
    }
}
