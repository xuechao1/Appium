package com.xuechao.toolsTest;

import com.xuechao.actions.ActionSs;
import com.xuechao.drivers.SeleniumDriver;
import com.xuechao.tools.MyAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/20.
 */
public class MyAssetTest {

    @Test
    public void testCase() {
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver, "http://www.baidu.com");
        driver.findElement(By.className("fasdf")).click();
        MyAssert.assertTrue(false);
        MyAssert.assertEquals("123123", "asdf");
    }
}
