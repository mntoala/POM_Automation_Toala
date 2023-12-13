package com.globant.web.tests;

import com.globant.web.utils.BaseTest;
import com.globant.web.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    
    @Test
    public void testLogout(){

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed());
        menuBtnPage.clickOnElement(menuBtnPage.getMenuButton());

        Assert.assertTrue(menuBtnPage.isMenuBtnPageDisplayed());
        menuBtnPage.clickOnElement(menuBtnPage.getLogoutButton());

        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }
}
