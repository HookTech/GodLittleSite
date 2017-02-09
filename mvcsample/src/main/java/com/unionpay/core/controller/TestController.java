package com.unionpay.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController extends CommonController{
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
}
