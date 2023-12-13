package com.globant.web.utils;
import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "LoginData")
    public static Object[][] getLoginData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"}
        };
    }
    @DataProvider(name = "PurchaseData")
    public Object[][] getPurchaseData(){
        return new Object[][] {
                {"Marina", "Toala", "EC-32604"}
        };
    }
}