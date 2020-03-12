package com.ctp.family.entity;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.entity
 * Description:TODO
 *
 * @date:2020/1/13 - 17:41
 * @Author:chaotianpeng
 */
public class Student {
    private String age;
    private String name;
    public Student(String age,String name){
        this.age=age;
        this.name=name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
