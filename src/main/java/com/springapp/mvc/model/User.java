package com.springapp.mvc.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cloudsher
 * @version 1.0
 * @date 2016/2/3
 */
public class User {

    private static ThreadLocal<User> local = new ThreadLocal<User>();
    private String userName;
    private static  User user;
    private static Lock lock = new ReentrantLock();

    private User(){

    }

    public static User getInstance(){
        if(user == null){
            lock.lock();
            user = new User();
            lock.unlock();
        }
        return user;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static void setLocal(User user){
        local.set(user);
    }


    public static User getLocal(){
        return local.get();
    }
}
