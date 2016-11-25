package com.springapp.mvc.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/11/7.
 */
@WebServlet(name = "my1",urlPatterns = "/async",asyncSupported = true)
public class AsyncMyServlet extends HttpServlet{


    public void service(HttpServletRequest req,HttpServletResponse response) throws IOException {
        //1.start asyncContext
        AsyncContext asyncContext = req.startAsync();

        ServletRequest request = asyncContext.getRequest();
        //2.listener
        asyncContext.addListener(new AsyncListener(){

            @Override
            public void onComplete(AsyncEvent asyncEvent) throws IOException {
                System.out.println("on complete ...");
            }

            @Override
            public void onTimeout(AsyncEvent asyncEvent) throws IOException {
                System.out.println("on time out");
            }

            @Override
            public void onError(AsyncEvent asyncEvent) throws IOException {
                System.out.println("on error ...");
            }

            @Override
            public void onStartAsync(AsyncEvent asyncEvent) throws IOException {
                System.out.println("on start async");
            }
        });
        //3.start thread to do something
        asyncContext.setTimeout(0);
        asyncContext.start(()-> {
            block();
            try {
//                response.getWriter().println(asyncContext.getRequest().getParameter("req"));
                asyncContext.dispatch("/app/request?a=3");
            } catch (Exception e) {
                e.printStackTrace();
            }
            //4.complete
//            asyncContext.complete();
        });



    }

    public void dispatch(HttpServletRequest req,HttpServletResponse res){
        AsyncContext context = req.startAsync();
        //分发请求
        context.dispatch();

    }


    public void block(){
        int n= 0;
        while(n++ < 10){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("current n :" +n);
        }
    }





}
