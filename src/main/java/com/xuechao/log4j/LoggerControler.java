package com.xuechao.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/14.
 */
/*
public class LoggerControler {
    private static Logger logger = null;
    private static LoggerControler logg = null;

    public static LoggerControler getlogger(Class<?>T){
        if (logger == null){
            //实例化 Properties 类，处理 .properties格式的文件
            Properties props = new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filePath = path+"/configs/log4j.properties";
                InputStream is = new FileInputStream(filePath);
                props.load(is);
            }catch (IOException e){
                e.printStackTrace();
            }
            PropertyConfigurator.configure(props);
            logger = Logger.getLogger(T);
            logg = new LoggerControler();
        }
        return logg;
    }

    public void info(String msg){
        logger.info(msg);
    }

    public void debug(String msg){
        logger.debug(msg);
    }

    public void warn(String msg){
        logger.warn(msg);
    }

    public void error(String msg){
        logger.error(msg);
    }


    public void info(long num) {
    }
}
*/

public class LoggerControler {
    private static Logger logger = null;
    private static LoggerControler logg = null;

    public static LoggerControler getlogger(Class<?> T) {
        if (logger == null) {
//           实例化 Properties 类，处理 .properties格式的文件
            Properties props = new Properties();
            try {
                String path = System.getProperty("user.dir");
                String filePath = path + "/configs/log4j.properties";
                InputStream is = new FileInputStream(filePath);
                props.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            PropertyConfigurator.configure(props);
            logger = Logger.getLogger(T);
            logg = new LoggerControler();
        }
        return logg;
    }

    public void info(Object msg) {
        logger.info(msg);
    }

    public void debug(String msg) {
        logger.debug(msg);
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void error(String msg) {
        logger.error(msg);
    }
}
