package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/11/30.
 */
@Controller
@RequestMapping("/repository")
public class RepositoryController {

    //	@Resource
//	CallerRepository callerRepository;
//
//	@RequestMapping("/rep")
//	@ResponseBody
//	public String test_repository(){
//		return callerRepository.findAll().toString();
//	}

//	@Resource
//	SeriesRepository seriesRepository;

//	@RequestMapping("/save")
//	@ResponseBody
//	public String test_repository(){
//		Series series = new Series();
//		series.setSeriesId("33");
//		series.setSeriesName("train");
//		series.setSeriesStatus(true);
////		seriesRepository.save(series);
//		return "success";
//	}
//
//
//
//	@RequestMapping("/findAll")
//	@ResponseBody
//	public String test_find(){
////		QSeries series = QSeries.series;
////		Predicate predicate = series.seriesId.eq("22");
//		Series series = new Series();
//		series.setSeriesId("33");
//		series.setSeriesName("zhangsan");
//		ExampleMatcher matcher = ExampleMatcher.matching()
//				.withIgnorePaths("seriesName");
//		Example example = Example.of(series,matcher);
////		seriesRepository.findAll(example).forEach(e ->{
////			if(e != null)
////				System.out.println(((Series)e).getSeriesName());
////		});
//		return "succ";
//	}


//	@RequestMapping("/jdo")
//	@ResponseBody
//	public String jdo_test(){
//		PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("Tutorial");
//		PersistenceManager pm = pmf.getPersistenceManager();
//		Account account = new Account();
//		account.setId("222");
//		account.setName("account22");
//		Loggin loggin = new Loggin();
//		loggin.setLogin("333");
//		loggin.setPassword("444");
//		account.setLoggin(loggin);
////		pm.makePersistent(account);
////		Object objectId = JDOHelper.getObjectId(account);
////		Object o = pm.getObjectById(objectId);
//		Query query = pm.newQuery("select from " + Account.class.getName());
//		Object result = query.execute();
//		if(result instanceof List){
//			List list = (List) result;
//			list.forEach(System.out::println);
//		}
//		return "success"+result;
//	}


}
