package com.java.testng.dataprovider.innerdata;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInnerData {

    @Test(dataProvider = "getUsers", dataProviderClass = Users.class)
    public void test(String str1, String str2, String str3) {
        System.out.println(str1 + "\n" + str2 + "\n" + str3);
        Assert.assertEquals(str1 + str2, str3);
    }


}
