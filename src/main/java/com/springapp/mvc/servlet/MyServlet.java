package com.springapp.mvc.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2016/11/4.
 *  mutil thread request
 */
public class MyServlet extends HttpServlet {

    private AtomicInteger count = new AtomicInteger();

    public void init() throws ServletException {
        ServletContext context = getServletContext();
        if(context!= null){
            Context ctx = new Context();
            Repository repository = new Repository();
            context.setAttribute("myContext",ctx);
            context.setAttribute("repository",repository);
        }
        System.out.println("servlet init "+this);
    }

    protected void service(HttpServletRequest req, HttpServletResponse res){
        System.out.println("servlet :" +this);
        int i = count.incrementAndGet();
        System.out.println("count is :" + i);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ServletContext context = getServletContext();
        Object myContext = context.getAttribute("myContext");
        Object repository = context.getAttribute("repository");
        Context myCtx = (Context) myContext;
        myCtx.setRepository((Repository) repository);
        myCtx.save(new Object());
    }

    public void destory(){
        System.out.println("servlet destory" + this);
    }

}
