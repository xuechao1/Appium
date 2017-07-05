package com.xuechao.find;

import com.xuechao.actions.ActionSs;
import com.xuechao.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/13.
 */
public class ActionTest {

    @Test
    public void testClick() throws InterruptedException {
        //打开网站
        WebDriver driver = SeleniumDriver.open("chrome");
        //打开 百度页面
        ActionSs.get(driver,"http://www.baidu.com");
        //通过 id定位 文本框  并 输入selenium
        ActionSs.sendText(By.id("kw"),"selenium");
        //点击 登录按钮（通过id定位）
        ActionSs.click(By.id("su"));
        Thread.sleep(3000);
        SeleniumDriver.closeAll();
    }

    @Test
    public void getText() throws InterruptedException {
        //打开chrome浏览器
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver,"http://www.baidu.com");
        //通过name方式定位，并获取 文本
        String text = ActionSs.getText(By.name("tj_trnews"));
        //输出文本
        System.out.println(text);
        Thread.sleep(2000);
        //关闭浏览器
        SeleniumDriver.closeAll();
    }

    @Test
    public void getTexts() throws InterruptedException {
        //打开chrome浏览器
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver,"http://www.baidu.com");
        ArrayList list = ActionSs.getTexts(By.xpath(".//*[@id='u1']/a"));
//      System.out.println(list.get(2));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        Thread.sleep(2000);
        SeleniumDriver.closeAll();
    }

    @Test
    public void doubleClickTest() throws InterruptedException {
        //打开chrome浏览器
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver,"http://www.baidu.com");
        ActionSs.doubleClick(driver,By.id("su"));
        Thread.sleep(2000);
        SeleniumDriver.closeAll();
    }
}
