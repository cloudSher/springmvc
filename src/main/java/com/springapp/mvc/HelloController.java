//package com.springapp.mvc;
//
//import com.lashou.service.sms.api.rpc.PushReqMsgService;
//import com.springapp.mvc.model.User;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping("/")
//public class HelloController {
//
//	@Autowired
//	private PushReqMsgService pushReqMsgService;
//
//	@RequestMapping(method = RequestMethod.GET)
//	public String printWelcome(ModelMap model,HttpServletRequest request) {
////		model.addAttribute("message", "Hello world!");
////		ServletContext context = request.getSession().getServletContext();
////
////		User user = User.getLocal();
////		if(user == null){
////			user  = User.getInstance();
////		}
////
////		int i = 0;
////		while (i++ < 10){
////			try {
////				Thread.sleep(10000);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
////			System.out.println(i);
////			System.out.println(Thread.currentThread().getName()+"============User:"+user+"===========ServletContext:"+context);
////		}
//		return "hello";
//	}
//
//
//
//	@RequestMapping(value = "/test")
//	public String ss(){
//		System.out.println(pushReqMsgService.pushMsg("{'mobiles':'18518567340,18610418821','content':'test','type':'1','scope':'2'}"));
//		return "hello";
//	}
//
//
//	@RequestMapping("/auth")
//	public String test_auther(){
//		Subject subject = SecurityUtils.getSubject();
//		return "hello";
//	}
//
//}