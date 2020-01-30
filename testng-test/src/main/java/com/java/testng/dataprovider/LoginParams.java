package com.java.testng.dataprovider;

import org.testng.annotations.DataProvider;

public class LoginParams {

    @DataProvider
    public Object[][] getUsers() {
        return new Object[][]{
                {"zhangsan", "123456", "欢迎zhangsan"},
                {"lisi", "123456", "欢迎zhangsan"},
                {"", "", "用户名或密码不能为空"},
                {"admin", "123456", "欢迎管理员"}
        };
    }

}
