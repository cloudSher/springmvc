package com.springapp.mvc.servlet;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/11/4.
 */
public class Context {

    private ConcurrentHashMap context = new ConcurrentHashMap();

    private Repository repository;

    public Context(){

    }

    public void put(String key,Object obj){
        context.put(key,obj);
    }

    public Object get(String key){
        return context.get(key);
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public void save(Object obj){
        repository.save(obj);
    }
}
