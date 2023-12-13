package com.globant.web.tests;

import com.globant.web.tests.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementsTest extends BaseTest {

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void LoginTest(String user, String psw) {
        loginPage.enterUserName(user);
        loginPage.enterPassword(psw);
        loginPage.clickOnElement(loginPage.getLoginButton());
    }
    @Test
    public void testRemove(){

        Assert.assertTrue(inventoryPage.isInventoryDisplayed());
        inventoryPage.clickOnElement(inventoryPage.getAddToCartP1());
        inventoryPage.clickOnElement(inventoryPage.getAddToCartP2());
        inventoryPage.clickOnElement(inventoryPage.getAddToCartP3());
        inventoryPage.clickOnElement(inventoryPage.getShoppingCart());


        Assert.assertTrue(cartPage.isCartDisplayed());
        cartPage.clickOnElement(cartPage.getRemoveP1());
        cartPage.clickOnElement(cartPage.getRemoveP2());
        cartPage.clickOnElement(cartPage.getRemoveP3());
        Assert.assertEquals(cartPage.nRemovedProducts(), 3);


    }
}
