package com.java.testng.dataprovider.yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import com.alibaba.fastjson.JSONObject;

public class YamlDataHelper {

    @DataProvider
    public Object[][] readYaml() {
        Yaml yaml = new Yaml();
        InputStream input = YamlDataHelper.class.getClassLoader().getResourceAsStream("data03.yaml");
        Map<String, Map<String, String>> map = yaml.loadAs(input, Map.class);
        System.out.println("原map:" + JSONObject.toJSONString(map));
        Object[][] obj = new Object[map.size()][];
        List<Map<String, String>> list = new ArrayList();
        for (Map.Entry<String, Map<String, String>> mapEntry : map.entrySet()) {
            Map<String, String> map01 = mapEntry.getValue();
            String keyStr = mapEntry.getKey();
            list.add(map01);
        }
        System.out.println("list:" + JSONObject.toJSONString(list));
        for (int i = 0; i < list.size(); i++) {
            obj[i] = new Object[]{list.get(i)};
        }
        return obj;
    }

    private List<Map<String, String>> getYaml() {
        Yaml yaml = new Yaml();
        URL url = YamlDataHelper.class.getClassLoader().getResource("data02.yaml");
        System.out.println("url:" + JSONObject.toJSONString(url));
        Map<String, Map<String, String>> map = null;
        try {
            map = (Map<String, Map<String, String>>) yaml.load(new FileInputStream(url.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("map:" + JSONObject.toJSONString(map));
        List<Map<String, String>> list = new ArrayList();
        for (Map.Entry<String, Map<String, String>> m : map.entrySet()) {
            Map<String, String> mm = m.getValue();
            Map<String, String> tem = new HashMap<String, String>();
            for (Map.Entry<String, String> me : mm.entrySet()) {
                String sKey = me.getKey();
                String sValue = me.getValue();
                tem.put(sKey, sValue);
            }
            list.add(tem);
        }
        return list;
    }

    @DataProvider
    public Object[][] yamlDataProvider() {
        List<Map<String, String>> list = getYaml();
        Object[][] obj = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            obj[i] = new Object[]{list.get(i)};
        }
        //System.out.println(JSONObject.toJSONString(obj));
        return obj;
    }

}
