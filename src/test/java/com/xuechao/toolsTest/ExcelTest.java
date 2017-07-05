package com.xuechao.toolsTest;


import com.xuechao.tools.ExcelUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/5/20.
 */
public class ExcelTest {

    public Object[][] testData(String file) {
        ArrayList<String> arrkey = new ArrayList<String>();
        Workbook workbook = ExcelUnit.getWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);
//        获取总行数
        int rowTotalNum = sheet.getLastRowNum()+1;
//        总列数
        int columns = sheet.getRow(0).getPhysicalNumberOfCells();

        HashMap<String, String>[][] map = new HashMap[rowTotalNum - 1][1];
        // 对数组中所有元素hashmap进行初始化
        if (rowTotalNum > 1) {
            for (int i = 0; i < rowTotalNum - 1; i++) {
                map[i][0] = new HashMap();
            }
        } else {
//            log.error("测试的Excel" + file + "中没有数据");
        }
        // 获得首行的列名，作为hashmap的key值
        for (int c = 0; c < columns; c++) {
            String cellvalue = ExcelUnit.getCellValue(sheet, 0, c);
            arrkey.add(cellvalue);
        }
        // 遍历所有的单元格的值添加到hashmap中
        for (int r = 1; r < rowTotalNum; r++) {
            for (int c = 0; c < columns; c++) {
                String cellvalue = ExcelUnit.getCellValue(sheet, r, c);
                map[r - 1][0].put(arrkey.get(c), cellvalue);
            }
        }
        return map;

    }

    @DataProvider(name = "t")
    public Object[][] data1() {
        ExcelTest excelTest = new ExcelTest();
        return excelTest.testData(".\\a.xlsx");
    }

    @Test(dataProvider = "t")
    public void test1(HashMap<String, String> data) {
        System.out.println(data.get("username"));
        System.out.println(data.get("pwd"));
    }
/*    @Test
    public void test2() {
        ExcelTest excelTest = new ExcelTest();
        Object[][] a = excelTest.testData(".\\a.xlsx");
        String a1 = (String) a[0][1];
        System.out.println(a);
    }*/
}
