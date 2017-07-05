package com.xuechao.toolsTest;

/**
 * Created by Administrator on 2017/7/4.
 */
public class TestException {

    public static void main(String[] args) {

        int a = 3;

        try {
            int b =a/0;
            System.out.println("hi");
        }catch (Exception ex){

        }finally {
            System.out.println("helloworld");
        }
    }
}
