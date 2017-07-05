package com.xuechao.drivers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/9.
 */
public class SeleniumDriverTest {

    @Test
    public void openTest() throws InterruptedException {
        WebDriver driver = SeleniumDriver.open("chrome");
        /*SeleniumDriver.open("ie");
        SeleniumDriver.open("firefox");*/

        Thread.sleep(2000);
        SeleniumDriver.closeAll();
    }
}
