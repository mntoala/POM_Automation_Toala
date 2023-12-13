package com.globant.web.tests;

import com.globant.web.utils.BaseTest;
import com.globant.web.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementsTest extends BaseTest {

    @Test
    public void testRemove(){

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
        inventoryPage.addProductsToCart();
        inventoryPage.clickOnElement(inventoryPage.getShoppingCart());

        Assert.assertTrue(cartPage.isCartPageDisplayed());
        cartPage.removeProductsToCart();
        Assert.assertEquals(cartPage.nRemovedProducts(), 3);


    }
}
