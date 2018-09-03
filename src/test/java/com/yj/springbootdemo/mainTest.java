package com.yj.springbootdemo;

import org.junit.Test;

/**
 * @Author 76355
 * @Date 2018/8/9 22:52
 * @Description
 */
public class mainTest {

   @Test
   public void test(){
       String str="123||456";
       String[] strArray=str.split("||");
       System.out.println(strArray.length);
   }
}
