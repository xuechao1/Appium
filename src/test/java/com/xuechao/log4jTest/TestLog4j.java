package com.xuechao.log4jTest;

import com.xuechao.log4j.LoggerControler;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/14.
 */
public class TestLog4j {
    final static  LoggerControler log = LoggerControler.getlogger(TestLog4j.class);

    @Test
    public void testCase(){
        log.info("这是info");
        log.debug("这是debug");
        log.warn("这是warn");
        log.error("这是error");
    }

}
