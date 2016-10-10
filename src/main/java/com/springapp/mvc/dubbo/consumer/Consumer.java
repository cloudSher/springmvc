package com.springapp.mvc.dubbo.consumer;

import com.springapp.mvc.dubbo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cloudsher on 2016/4/25.
 */
public class Consumer {

    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo_consumer.xml");
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloConsumer");
        System.out.println(helloService.hello());

    }
}
