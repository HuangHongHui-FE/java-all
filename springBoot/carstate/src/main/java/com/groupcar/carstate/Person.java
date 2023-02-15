package com.groupcar.carstate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

// 表示person被springboot 所识别
@Component
//使用配置里面的属性, 带prefix指定为person的属性
//@ConfigurationProperties(prefix = "person")
@ConfigurationProperties
public class Person {
    private String name;
    private int age;
    private String[] address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    @Autowired
    private Environment env;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
