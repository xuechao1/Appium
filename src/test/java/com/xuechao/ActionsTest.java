package com.xuechao;

import com.xuechao.actions.ActionSs;
import com.xuechao.drivers.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/20.
 */
public class ActionsTest {

    @Test
    public void testClick() throws InterruptedException {
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver, "http://www.baidu.com");
        ActionSs.sendText(By.id("kw"), "selenium");
        ActionSs.click(By.id("su"));
        Thread.sleep(3000);
        SeleniumDriver.closeAll();
    }

    @Test
    public void getText() throws InterruptedException {
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver, "http://www.baidu.com");
        String text = ActionSs.getText(By.name("tj_trnews111111"));
        System.out.println(text);
        Thread.sleep(3000);
        SeleniumDriver.closeAll();
    }

    @Test
    public void getTextsTest() throws InterruptedException {
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver, "http://www.baidu.com");
        ArrayList list = ActionSs.getTexts(By.xpath(".//*[@id='u1']/a"));
//        System.out.println(list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Thread.sleep(3000);
        SeleniumDriver.closeAll();

    }

    @Test
    public void doubleClickTest() {
        WebDriver driver = SeleniumDriver.open("chrome");
        ActionSs.get(driver, "http://www.baidu.com");
        ActionSs.doubleClick(driver, By.id("su"));
    }
}
