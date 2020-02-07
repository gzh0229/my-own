package com.java.testng.dataprovider.excel;

import org.testng.annotations.Test;

import java.util.Map;

public class TestExcelData {

    @Test(dataProvider = "excelDataProvider", dataProviderClass = ExcelDataHelper.class)
    public void testExcelDataProvider(Map<?, ?> param) {
        System.out.println(param.get("mapKey") + "\t" + param.get("mapValue"));
    }

}