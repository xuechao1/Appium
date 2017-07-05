package com.xuechao.drivers;

import com.xuechao.log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Administrator on 2017/5/9.
 */
public class SeleniumDriver {
    final static LoggerControler log = LoggerControler.getlogger(SeleniumDriver.class);
    public static WebDriver driver;
    public static WebDriver open (String browser) {
        String path = System.getProperty("user.dir");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdirver.firefox.driver", path + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equals("ie")) {
            System.setProperty("webdirver.ie.driver", path + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
//            System.err.println("你传入的浏览器名称有误： " + browser);
            log.error("你传入的浏览器名称有误： " + browser);
        }
            return driver;
    }

    public static void closeAll(){
        driver.quit();
    }

    public static void close(){
        driver.close();
    }

}
