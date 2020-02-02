package com.java.testng.dataprovider.innerdata;

import org.testng.annotations.DataProvider;

public class Users {

    @DataProvider
    public Object[][] getUsers() {
        return new Object[][]{
                {"张三", "123", "张三123"},
                {"李四", "456", "李四456"},
                {"王五", "789", "王五123"}
        };
    }

}
