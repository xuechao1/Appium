package com.xuechao.wait;

import com.xuechao.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Administrator on 2017/5/11.
 */
public class WebElementUtils extends SeleniumDriver{

    public static WebElement findElement(final By by){
//        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e) {
            System.out.println("元素："+by+"查找超时！！！");
            e.printStackTrace();
        }
        return driver.findElement(by);
    }

    public static List<WebElement> findElements(final By by){
        List<WebElement> webElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            webElement = driver.findElements(by);
        }catch (Exception e) {
            System.out.println("元素："+by+"查找超时！");
            e.printStackTrace();
        }
        return webElement;
    }

/*
    public static List<WebElement> findElements(final By by){
        List<WebElement> webElement = null;
        try {
            webElement = new WebDriverWait(driver,10).until(new ExpectedCondition<List<WebElement>>() {
                public List<WebElement> apply(WebDriver driver) {
                    return driver.findElements(by);
                }
            });
        }catch (Exception e) {
            System.out.println("元素："+by+"查找超时！");
            e.printStackTrace();
        }
        return webElement;
    }
*/



}
