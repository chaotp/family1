package com.ctp.family.antoProxyTest;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.antoProxyTest
 * Description:TODO
 *
 * @date:2020/1/9 - 9:50
 * @Author:chaotianpeng
 */
public class DealProImp implements  DealPro{
    @Override
    public void buy() {
        System.out.println("-----开始买东西-----");
    }

    @Override
    public Boolean money(String money) {
        System.out.println("-----活的钱财-----");
        return null;
    }
}
