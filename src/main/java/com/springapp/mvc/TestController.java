package com.springapp.mvc;

import com.springapp.mvc.mapper.CallerMapper;
import com.springapp.mvc.model.Demo;
import com.springapp.mvc.service.CallService;
import com.springapp.mvc.validator.MyValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/app")
public class TestController {

	private MyValidator validator = new MyValidator();

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printWelcome() {
		return new ModelAndView("hello");
	}


	@RequestMapping("/auth")
	public String test_auther(){
//		Subject subject = SecurityUtils.getSubject();
		return "hello";
	}

	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}

	@RequestMapping("/valid")
	@ResponseBody
	public String valid(Demo demo,Errors bindingResult){
//		if(bindingResult.hasErrors()){
//			return bindingResult.toString();
//		}else{
//			return demo.toString();
//		}
		validator.validate(demo,bindingResult);
		if(bindingResult.hasErrors()){
			return bindingResult.getAllErrors().toString();
		}
		else{
			return demo.toString();
		}
	}

	@RequestMapping("/view")
	public ModelAndView view(){
		Map<String,Object> map = new HashMap<>();
		map.put("id","1111");
		map.put("name","zhangsan");
		return new ModelAndView("hello",map);
	}

	@Autowired
	private CallerMapper callerMapper;

	@RequestMapping("/test")
	@ResponseBody
	public String test_mapper(HttpServletResponse response){
//		response.get
		return callerMapper.selectByPrimaryKey(1).toString();
	}


	@RequestMapping("/run")
	@ResponseBody
	public String testRuntimeException(){
		try{
//			int a = 5/0;
		}catch (Exception e){
			throw new RuntimeException("test ....");
		}
		throw new RuntimeException(".....run =====");
//		return "success";
	}


	@RequestMapping("/request")
	@ResponseBody
	public String testHttpServletRequest(HttpServletRequest request){
		String req = request.getParameter("a");
		return req;
	}


	@Autowired
	CallService callService;

	/***
	 * 测试多数据源情况下，事务处理器分配问题
	 * @return
     */
	@RequestMapping("/tran")
	@ResponseBody
	public String transaction(){
		callService.add();
		return "suc";
	}


}