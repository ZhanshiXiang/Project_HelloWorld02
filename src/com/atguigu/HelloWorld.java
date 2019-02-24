package com.atguigu;

import java.util.ArrayList;
import java.util.List;
//单行注释

/**
 * 文档注释
 */

/*

多行注释
 */
public class HelloWorld {
   private static  final int  CHILD_AGE =12;
    public HelloWorld() {
    }

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("ahduf");
        list.add("hdubf");
        list.add("dufba ");

        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        System.out.println("HelloWorld!!!");

    }





}
