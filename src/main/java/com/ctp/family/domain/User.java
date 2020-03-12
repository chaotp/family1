package com.ctp.family.domain;

/**
 * ClassName:16338
 * package:com.ctp.family.domain
 * Description:TODO
 *
 * @date:2020/1/16 - 11:14
 * @Author:chaotianpeng
 */
public class User {
        private Integer id;
        private String name;
        private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
