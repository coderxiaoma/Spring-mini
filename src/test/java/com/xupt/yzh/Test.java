package com.xupt.yzh;

import com.xupt.pony.demo.action.MyAction;
import com.xupt.pony.framework.context.MYApplicationContext;

public class Test {

    public static void main(String[] args) {
        MYApplicationContext context = new MYApplicationContext("classpath:application.properties");
        try {
            Object bean = context.getBean("myAction");
            System.out.println(bean);
            MyAction myAction = (MyAction)bean;
            myAction.test("張三");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
