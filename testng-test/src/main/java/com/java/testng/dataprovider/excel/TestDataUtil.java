package com.java.testng.dataprovider.excel;

import org.testng.annotations.Test;

import java.util.Map;

public class TestDataUtil extends ExcelDataHeleper {

    @Test(dataProvider = "dataMethod")
    public void testmethod1(Map<?, ?> param) {
        System.out.println(param.get("num1") + "\t" + param.get("num2"));
    }

}