package com.unionpay.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unionpay.common.log.LogWriter;
import com.unionpay.core.service.LoadFrameService;
import com.unionpay.core.bean.*;

@Controller
@RequestMapping("main_frame")
public class MainFrameController extends CommonController{
//	private static final Logger logger = Logger.getLogger(MainFrameController.class);
	
	@Autowired
	LoadFrameService loadService;
	
	@RequestMapping("")
	public String loadWebsiteInfo(Model model){
		LogWriter.info("正在载入主页...");
		SystemSetting sysSet = loadService.getSystemSetting("godsite");
		model.addAttribute("web_title", sysSet.getTitle());
		model.addAttribute("web_address", sysSet.getAddress());
		model.addAttribute("web_tel", sysSet.getTel());
		model.addAttribute("web_mail", sysSet.getMail());
		LogWriter.info("载入主页完成");
		return "/frame/main_frame";
	}
	/**
	 * 载入主页主菜单
	 * */
	@RequestMapping(value="main_menu",method=RequestMethod.POST,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String loadMainMenu(Model model){
		return loadService.getMainMenusString();//主菜单的json串
	}
}
