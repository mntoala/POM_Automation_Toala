package com.globant.web.tests;

import com.globant.web.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage;
    InventoryPage inventoryPage;
    ProductPage productPage;
    CartPage cartPage;
    InformationPage informationPage;
    SuccessPage successPage;
    OverviewPage overviewPage;
    MenuBtnPage menuBtnPage;

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

    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
