package com.gpedu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2019-03-27.
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("dubbo-client.xml");
        IGpHello iGpHello = (IGpHello) classPathXmlApplicationContext.getBean("gpHelloService");
        System.out.println(iGpHello.sayHello("hi"));
    }
}
