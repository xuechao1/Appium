package com.xuechao.tools;

import com.xuechao.drivers.SeleniumDriver;
import com.xuechao.log4j.LoggerControler;
import org.testng.annotations.Test;


import java.util.Random;

/**
 * Created by Administrator on 2017/5/15.
 * 随机数 封装
 */
public class RandomNum {
    final static LoggerControler log = LoggerControler.getlogger(SeleniumDriver.class);


    //生成N位数的随机数    Math.random() 表示 随机数
    public static String getNumRandom(int length){
        String num = "";
        //  random()  生成一个 【0，1）期间的随机数
        //  Math.pow()  是 java中10的次方数表达方式
        //强制 转换成long 长整形
        num = String.valueOf((long) (Math.random() * Math.pow(10,length)));
        log.info(num);
        return num;
    }

/*    @Test
    public void a(){
        //随机数强制转换成String类型
        String a = String.valueOf(Math.random());
        log.info(a);
    }*/

    //生成一个 某个值到某个值的区间  随机数
    public static int getNumRandom(int min,int max){
        int num = 0;
        Random random = new Random();
        //   min 10  max 20  [10,20)   [1,11)   11+10    21
        num = random.nextInt(max - min + 1) + min;
        log.info(num);//生成不了log  咋回事  此处不能选择 info(Object) 类型 奇怪！！！！！！
        System.out.println(num);

        return num;

    }

    //生成一个随机的 字符串  数字+字符
    public static String getStringRandom(int length){
        String val = "";
        Random random = new Random();

        for (int i = 0; i <length ; i++) {
            String charornum = random.nextInt(2)%2 == 0 ? "char":"num";
            if (charornum.equals("char")){
                int tem = random.nextInt(2) % 2 ==0 ? 65 : 97 ;
                val += (char) (random.nextInt(26) + tem);
//                log.info(a);
//                System.out.println(a);
            }else if (charornum.equals("num")){
                val += String.valueOf(random.nextInt(10));
            }
        }
        System.out.println(val);
        log.info(val);
        return val;
    }

}
