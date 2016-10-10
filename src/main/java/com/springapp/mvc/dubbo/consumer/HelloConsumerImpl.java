package com.springapp.mvc.dubbo.consumer;

import com.springapp.mvc.dubbo.api.HelloService;

/**
 * Created by cloudsher on 2016/4/25.
 */
public class HelloConsumerImpl {

    private HelloService helloService;

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public static void main(String args[]){

    }
}
