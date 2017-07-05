package com.xuechao.toolsTest;

import com.xuechao.tools.DataFormate;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/5/15.
 */
public class DataFormateTest {

    @Test
    public void testCase(){
        DataFormate.format(DataFormate.ZH_DATE_FORMAT);
        DataFormate.format(DataFormate.CHECK_LOG_FORMAT);
    }
}
