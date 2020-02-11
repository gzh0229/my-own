package com.java.testng.dataprovider.yaml;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;

import java.util.Map;

public class TestYamlData {

    @Test(dataProvider = "readYaml", dataProviderClass = YamlDataHelper.class)
    public void testYaml01(Map<String, String> map) {
        System.out.println("map:" + JSONObject.toJSONString(map));
    }

    @Test(dataProvider = "yamlDataProvider", dataProviderClass = YamlDataHelper.class)
    public void testYaml02(Map<String, String> map) {
        System.out.println("map:" + JSONObject.toJSONString(map));
    }

}
