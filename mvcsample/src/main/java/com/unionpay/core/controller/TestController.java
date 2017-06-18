package com.unionpay.core.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unionpay.core.bean.Boxwrap;

@RestController
public class TestController extends CommonController{
	private static final Logger logger = Logger.getLogger(CommonController.class);
	/**
	 * 测试页
	 * */
	@RequestMapping("/test/sample")
	public String samplePage(){
		return "/test/sample";
	}
	/**
	 * bootstrap中会向服务器请求这个奇怪的地址，直接忽略
	 * */
	@RequestMapping("/node_modules/bootstrap/dist/css/bootstrap.min.css.map")
	public void nullPage(){
		return;
	}
	
	@RequestMapping("/recommend/boxwrap/context.json")
	public Boxwrap jsonRes(@RequestParam(value = "index",required = false) Integer index){
		logger.info("聪宝的请求到了!");
		Boxwrap mockWrap = new Boxwrap();
		mockWrap.setTitle("面包和牛奶");
		mockWrap.setTutor("小布");
		mockWrap.setIntro("小步造了面包和牛奶");
		return mockWrap;
	}
}
