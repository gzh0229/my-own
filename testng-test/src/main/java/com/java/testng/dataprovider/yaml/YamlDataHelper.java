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
import org.yaml.snakeyaml.Yaml;

public class YamlDataHelper {

    @DataProvider
    public Object[][] readYaml() {
        Yaml yaml = new Yaml();
        InputStream input = YamlDataHelper.class.getClassLoader().getResourceAsStream("data03.yaml");
        Map<String, Map<String, String>> map = yaml.loadAs(input, Map.class);
        Object[][] obj = new Object[map.size()][];
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (Map.Entry<String, Map<String, String>> mapEntry : map.entrySet()) {
            Map<String, String> map01 = mapEntry.getValue();
            String keyStr = mapEntry.getKey();
            list.add(map01);
        }
        for (int i = 0; i < list.size(); i++) {
            obj[i] = new Object[]{list.get(i)};
        }
        return obj;
    }

    @DataProvider
    public Object[][] yamlDataProvider() {
        Yaml yaml = new Yaml();
        URL url = YamlDataHelper.class.getClassLoader().getResource("data02.yaml");
        Map<String, Map<String, String>> map = null;
        try {
            map = (Map<String, Map<String, String>>) yaml.load(new FileInputStream(url.getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
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
        Object[][] obj = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            obj[i] = new Object[]{list.get(i)};
        }
        return obj;
    }

}
