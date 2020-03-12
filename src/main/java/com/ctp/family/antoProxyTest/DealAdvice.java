package com.ctp.family.antoProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.antoProxyTest
 * Description:TODO
 *
 * @date:2020/1/9 - 10:45
 * @Author:chaotianpeng
 */
public class DealAdvice implements InvocationHandler {
    private DealPro dealPro;
    public DealAdvice(DealPro dealPro){
        this.dealPro=dealPro;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object invoke = method.invoke(dealPro, args);
        doAfter();
        return null;
    }
    public void doBefore(){
        System.out.println("-----增强之前的处理-----");
    }
    public void doAfter(){
        System.out.println("-----增强之后的处理-----");
    }
}
