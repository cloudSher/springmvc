package com.springapp.mvc.servlet;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/11/4.
 */
public class Repository {

    private ConcurrentHashMap db = new ConcurrentHashMap();

    public  void save(Object obj){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        db.put("db",obj);
    }
}
