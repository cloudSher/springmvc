package com.springapp.mvc.service;

import com.springapp.mvc.domain.Caller;
import com.springapp.mvc.mapper.CallerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/25.
 */
@Service
public class CallService {

    @Autowired
    CallerMapper mapper;

    @Transactional
    public synchronized void add(){
        try{
            doAdd();
        }catch (Exception e){
            System.out.println("error is :"  + e);
        }
    }


    public void doAdd(){
        System.out.println(" transaction  start ....");
        Caller caller = new Caller();
        caller.setCallerid(11);
        caller.setCallername("test");
        caller.setCalltime(new Date());
        caller.setDescription("test transaction ...");
        caller.setType("1");
        mapper.insert(caller);
        System.out.println(" transaction end ....");

        //add exception
        wait_time(false);
        caller.setCallerid(8);
        mapper.insert(caller);
    }

    public void wait_time(boolean flag){
        while(flag){

        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
