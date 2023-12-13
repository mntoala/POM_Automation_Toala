package com.globant.web.tests;

import com.globant.web.tests.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseProductTest extends BaseTest {

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void LoginTest(String user, String psw) {
        loginPage.enterUserName(user);
        loginPage.enterPassword(psw);
        loginPage.clickOnElement(loginPage.getLoginButton());
    }

    @Test(dataProvider = "PurchaseData", dataProviderClass = TestData.class)
    public void testPurchase(String firstName, String lastName, String postalCode){

        Assert.assertTrue(inventoryPage.isInventoryDisplayed());
        inventoryPage.clickOnElement(inventoryPage.getProduct1());

        Assert.assertTrue(productPage.isProductDisplayed());
        productPage.clickOnElement(productPage.getAddToCartP1());
        productPage.clickOnElement(inventoryPage.getShoppingCart());

        Assert.assertTrue(cartPage.isCartDisplayed());
        cartPage.clickOnElement(cartPage.getCheckoutButton());

        Assert.assertTrue(informationPage.isCheckoutDisplayed());
        informationPage.enterFirstName(firstName);
        informationPage.enterLastName(lastName);
        informationPage.enterPostalCode(postalCode);
        informationPage.clickOnElement(informationPage.getContinueButton());

        Assert.assertTrue(overviewPage.isOverviewDisplayed());
        overviewPage.clickOnElement(overviewPage.getFinishButton());
        Assert.assertEquals(successPage.getTextToValidate(),"Thank you for your order!");





    }
}
