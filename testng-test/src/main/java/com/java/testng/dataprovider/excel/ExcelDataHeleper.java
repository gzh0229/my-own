package com.java.testng.dataprovider.excel;

import org.testng.annotations.DataProvider;

import java.util.List;
import java.util.Map;

public class ExcelDataHeleper {

    @DataProvider
    public Object[][] dataMethod() {
        List<Map<String, String>> result = ReadExcelUtil.getExcuteList("src/main/resources/data01.xlsx");
        Object[][] files = new Object[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            files[i] = new Object[]{result.get(i)};
        }
        return files;
    }

}