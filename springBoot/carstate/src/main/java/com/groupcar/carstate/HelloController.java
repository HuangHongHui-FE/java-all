package com.groupcar.carstate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${name}")
    private String name;

    @Value("${person.name}")
    private String name2;

    @Autowired
    private Environment env;

//    导入自定义的person
    @Autowired
    private Person person;

//    浏览器就可以访问http://localhost:8080/hello2
    @RequestMapping("hello2")
    public String hello2(){
        System.out.println(name);
        System.out.println(name2);

        System.out.println(env.getProperty("name"));


        System.out.println("----------------------");
        System.out.println(person);

        String[] address = person.getAddress();
        for (String s : address){
            System.out.println(s);
        }
        return "hello";
    }


    @RequestMapping("/hello")
    public String hello(){
        return "Heoolo;!";
    }
}
