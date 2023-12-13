package com.globant.web.tests;

import com.globant.web.tests.utils.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void LoginTest(String user, String psw) {
        loginPage.enterUserName(user);
        loginPage.enterPassword(psw);
        loginPage.clickOnElement(loginPage.getLoginButton());
    }

    @Test
    public void testLogout(){

        Assert.assertTrue(inventoryPage.isInventoryDisplayed());
        menuBtnPage.clickOnElement(menuBtnPage.getMenuButton());

        Assert.assertTrue(menuBtnPage.isMenuBtnDisplayed());
        menuBtnPage.clickOnElement(menuBtnPage.getLogoutButton());

        Assert.assertTrue(loginPage.isLoginDisplayed());
    }
}
