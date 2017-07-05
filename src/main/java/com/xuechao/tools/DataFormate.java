package com.xuechao.tools;

import com.xuechao.log4j.LoggerControler;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/15.
 */
public class DataFormate {
    final static LoggerControler log = LoggerControler.getlogger(DataFormate.class);

    public static final String COMMON_DATE_FORMAT = "yyyy-MM-dd";

    public static final String SHORT_DATE_FORMAT = "yy-MM-dd HH:mm";

    public static final String SMALL_DATE_FORMAT = "MM-dd";

    public static final String ABC_ORDER_DATE_FORMAT = "yyyy/MM/dd";

    public static final String ABC_ORDER_TIME_FORMAT = "HH:mm:ss";

    public static final String LOTTERY_PRINTING_TIME_FORMAT = "HH_mm_ss";

    public static final String CHECK_LOG_FORMAT = "yyyyMMdd";

    public static final String TEN_PAY_DATE_STRING_FORMAT = "yyMMdd";

    public static final String REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";

    public static final String ZH_DATE_FORMAT = "yyyy年MM月dd日 HH:mm:ss";

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT = "yyyy-MM-dd HH-mm-ss";

    //	引入SimpleDateFormat类处理时间
    private static SimpleDateFormat simpleDateFormat;

    public static String format(String type) {
        //simpleDateFormat 给我们提供了一个format方法，通过format把时间格式化某种类型、格式的一种时间
        simpleDateFormat = new SimpleDateFormat(type);
        //new Date 表示把当前的时间格式化掉
        String s = simpleDateFormat.format(new Date());
        log.info(s);
        return s;
    }


    public static long time() {
        long t = System.currentTimeMillis();
        log.info(String.valueOf(t));
        return t;
    }


}
