package com.xuechao.toolsTest;

import com.xuechao.tools.RandomNum;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * Created by Administrator on 2017/5/15.
 */
public class RandomNumTest {

    @Test
    public void longTest1(){
        //测试随机生成5位数
        RandomNum.getNumRandom(10);
    }

    @Test
    public void longTest2(){
        Random random = new Random();
        long a = random.nextLong();
        System.out.println(a);
    }

    @Test
    public void longTest3(){
        RandomNum.getNumRandom(3,100);
    }

    @Test
    public void tt(){
        RandomNum.getStringRandom(3);
    }


}
