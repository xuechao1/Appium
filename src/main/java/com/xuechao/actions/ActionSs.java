package com.xuechao.actions;

import com.xuechao.log4j.LoggerControler;
import com.xuechao.wait.WebElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public class ActionSs {
    final static LoggerControler log = LoggerControler.getlogger(ActionSs.class);
    //打开网站
    public static void get(WebDriver driver,String url){
            driver.get(url);
            log.info("打开网站："+url);
    }

    //用来存放对WebDriverAPI的封装
    //by 表示对哪个元素进行定位，进行操作
    //点击 方法
    public static void click(By by){
//        driver.findElement(by).click();
        //做到智能  等待
        WebElementUtils.findElement(by).click();
        log.info("点击元素:"+by);
    }
    //文本框输入方法
    public static void sendText(By by,String text){
        WebElement element = WebElementUtils.findElement(by);
        element.clear();
        element.sendKeys(text);
        log.info("在文本框为"+by+"输入了："+text);
    }

    //获取 文本   by方式方法
    public static String getText(By by){
        String text = WebElementUtils.findElement(by).getText();
        log.info("获取的文本"+text);
        return text;
    }

    //获取多个文本值
    public static ArrayList getTexts(By by){
        ArrayList arrayList = new ArrayList();
        List<WebElement> list = WebElementUtils.findElements(by);
        for (int i = 0; i <list.size() ; i++) {
            String text =list.get(i).getText();
            arrayList.add(text);
        }
        return arrayList;
    }

    public static void doubleClick (WebDriver driver,By by){
        Actions actions = new Actions(driver);
        WebElement element = WebElementUtils.findElement(by);
        //双击 并执行
        actions.doubleClick(element).perform();
        log.info("这是一个双击："+element);
    }
}
