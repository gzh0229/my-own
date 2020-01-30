package com.java.testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "getUsers", dataProviderClass = LoginParams.class)
    public void testLogin(String name, String pwd, String except) {
        Login login = new Login();
        String res = login.userLogin(name, pwd);
        System.out.println(res);
        Assert.assertEquals(res, except);
    }


}
