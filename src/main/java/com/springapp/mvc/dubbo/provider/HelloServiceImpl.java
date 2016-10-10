package com.springapp.mvc.dubbo.provider;

import com.springapp.mvc.dubbo.api.HelloService;

/**
 * Created by cloudsher on 2016/4/25.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "dubbo provider";
    }
}
