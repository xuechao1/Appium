package com.xuechao.find;

import com.xuechao.drivers.SeleniumDriver;
import com.xuechao.wait.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/11.
 */
public class WebElementUtilsTest {

    @Test
    public void findTest(){
        WebDriver driver = SeleniumDriver.open("chrome");
        driver.get("file:///C:/selenium_html/index.html");
        WebElementUtils.findElement(By.className("wait")).click();
        String text = WebElementUtils.findElement(By.className("red")).getText();
        System.out.println(text);
    }

}
