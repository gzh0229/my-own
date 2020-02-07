package com.java.testng.dataprovider.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDataHelper {

    @DataProvider
    public Object[][] excelDataProvider() {
        String filePath = "src/main/resources/data01.xlsx";
        String fileSuffix = filePath.substring(filePath.indexOf("."));
        Workbook wb = null;
        try {
            InputStream input = new FileInputStream(filePath);
            if (fileSuffix.equals(".xlsx")) {
                wb = new XSSFWorkbook(input);
            } else if (fileSuffix.equals(".xls")) {
                wb = new HSSFWorkbook(input);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取第一页表格
        Sheet sheet = wb.getSheetAt(0);
        List<Map<String, String>> sheetList = new ArrayList<Map<String, String>>();
        String cellMap[] = {"mapKey", "mapValue"};
        //获取物理行数
        int rows = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rows; i++) {
            Map<String, String> rowMap = new LinkedHashMap<String, String>();
            //获取行
            Row row = sheet.getRow(i);
            if (row != null) {
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {  //row.getPhysicalNumberOfCells()获取物理列数
                    //获取单元格
                    Cell cell = row.getCell(j);
                    String cellData = null;
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case NUMERIC:  //数值型
                                cellData = String.valueOf(cell.getNumericCellValue());
                                break;
                            case STRING:  //字符串型
                                cellData = cell.getStringCellValue();
                                break;
                            case BOOLEAN:  //布尔型
                                cellData = String.valueOf(cell.getBooleanCellValue());
                                break;
                            case FORMULA:  //公式型
                                cellData = cell.getCellFormula();
                                break;
                            default:
                                break;
                        }
                    }
                    rowMap.put(cellMap[j], cellData);
                }
            } else if (row == null) {
                rows++;
                continue;
            }
            sheetList.add(rowMap);
        }
        Object[][] sheetObject = new Object[sheetList.size()][];
        for (int i = 0; i < sheetList.size(); i++) {
            sheetObject[i] = new Object[]{sheetList.get(i)};
        }
        return sheetObject;
    }


}
