package com.globant.web.utils;

import com.globant.web.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public InventoryPage inventoryPage;
    public ProductPage productPage;
    public CartPage cartPage;
    public InformationPage informationPage;
    public SuccessPage successPage;
    public OverviewPage overviewPage;
    public MenuBtnPage menuBtnPage;

    @BeforeTest
    public void beforeTest(){
        loginPage = new LoginPage(driver,"https://www.saucedemo.com/" );
        inventoryPage = new InventoryPage(driver);
        productPage= new ProductPage(driver);
        cartPage= new CartPage(driver);
        informationPage = new InformationPage(driver);
        successPage = new SuccessPage(driver);
        overviewPage= new OverviewPage(driver);
        menuBtnPage= new MenuBtnPage(driver);

    }
    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void LoginTest(String user, String psw) {
        loginPage.enterLogin(user, psw);
    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
