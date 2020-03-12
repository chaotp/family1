package com.ctp.family.antoProxyTest;

import java.lang.reflect.Proxy;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.antoProxyTest
 * Description:TODO
 *
 * @date:2020/1/9 - 11:00
 * @Author:chaotianpeng
 */
public class Client {
    public static void main(String[] args) {
        DealPro dealPro=new DealProImp();
        DealPro proxy = (DealPro)Proxy.newProxyInstance(dealPro.getClass().getClassLoader(), dealPro.getClass().getInterfaces(),
                new DealAdvice(dealPro));
        proxy.buy();
    }
}
