package com.ctp.family.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.listener
 * Description:TODO
 *
 * @date:2020/1/6 - 16:08
 * @Author:chaotianpeng
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("-----MyListener的contextInitialized方法-----");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("-----MyListener的contextDestroyed方法-----");
    }
}
