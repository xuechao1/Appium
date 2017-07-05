package com.xuechao.actions;

import com.xuechao.drivers.SeleniumDriver;
import com.xuechao.tools.DataFormate;
import com.xuechao.tools.MyFile;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

//import com.autoframework.logger.LoggerControler;
import static com.xuechao.drivers.SeleniumDriver.driver;


/**
 * Created by Administrator on 2017/5/20.
 */
public class ScreenShot {
    //    protected static final LoggerControler log = LoggerControler.getLogger(ScreenShot.class);

    static String path = System.getProperties().getProperty("user.dir") + "/error/";

    /**
     * 错误截图
     **/
    public static void screenShots() {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        try {
            MyFile myFile = new MyFile();
//            根据日期创建文件夹
            myFile.creatFile(path + DataFormate.format(DataFormate.DATE_FORMAT));
            FileUtils.copyFile(file, new File(path + DataFormate.format(DataFormate.CHECK_LOG_FORMAT) + "/" +
                    DataFormate.format(DataFormate.DATE_FORMAT) + ".jpg"));
        } catch (IOException e) {
//            log.error("截图失败！！");
            e.printStackTrace();
        }
    }

    /**
     * 错误截图
     **/
    public static void screenShots(String name) {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File file = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
        try {
//            ScreenShot.fileExists();
            MyFile myFile = new MyFile();
            myFile.creatFile(path + DataFormate.format(DataFormate.CHECK_LOG_FORMAT));
            FileUtils.copyFile(file, new File(path + DataFormate.format(DataFormate.DATE_FORMAT) + "/" + name + ".jpg"));
        } catch (IOException e) {
//            log.error("截图失败！！");
            e.printStackTrace();
        }
    }

    /**
     * 判断文件夹，没有就新建
     */
/*    public static void fileExists() {
        String fileName = DateUtil.format(DateUtil.CHECK_LOG_FORMAT);
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }*/
}
