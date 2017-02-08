package com.springapp.mvc;

import com.springapp.mvc.model.Demo;
import com.springapp.mvc.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * Created by Administrator on 2016/9/1.
 */
public class Main {


    public static void main(String args[]){
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/ApplicationContext.xml,mvc-dispatcher-servlet.xml");
//        context.getBean("testController");

//        test_hascode();
//        Func func = a -> {System.out.println(a);};
        System.out.println(print(null));
    }

    public static void test_hascode(){
        Person demo = new Person();
        Person demo1 = new Person();
        Person person = new Person();
        System.out.println(demo);
        System.out.println(demo1);
        System.out.println(person);

        System.out.println(demo.equals(demo1));
    }



    public void lamd_test(){
        List<Function<Context,Boolean>> list = new ArrayList<>();
        list.add(context -> isValid(context));
        Context context = new Context();
        for (Function<Context,Boolean> func : list){
            if(!func.apply(context)){
                return ;
            }
        }
    }

    private static Boolean isValid(Context context) {
        if(context.data.isEmpty())
            return false;
        return true;
    }


    public void test(){
        int a = 0;
        synchronized (this){
            a = 10;
            a++;
        }
        a = 11;
    }


    public static String print(String str){
       return  Optional.ofNullable(str).map(s -> s.toUpperCase()).orElse("NaN");
    }


    static class Context{
        private String data;
    }


    interface Func{
        void func(String a);
    }


    public static void springContext(String beanName){
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("");
        cxt.getBean(beanName);
    }


}
