package com.unionpay.core.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unionpay.core.service.LoadFrameService;
import com.unionpay.core.bean.*;

@Controller
@RequestMapping("main_frame")
public class MainFrameController {
	private static final Logger logger = Logger.getLogger(MainFrameController.class);
	
	@Autowired
	LoadFrameService loadService;
	
	@RequestMapping("")
	public String loadWebsiteInfo(Model model){
		logger.info("正在载入主页...");
		SystemSetting sysSet = loadService.getSystemSetting("godsite");
		model.addAttribute("web_title", sysSet.getTitle());
		model.addAttribute("web_address", sysSet.getAddress());
		model.addAttribute("web_tel", sysSet.getTel());
		model.addAttribute("web_mail", sysSet.getMail());
		logger.info("载入主页完成");
		return "/frame/main_frame";
	}
	
	@RequestMapping("main_menu")
	public String loadMainMenu(Model model){
		String MenuString = loadService.getMainMenusString();
		logger.info("\n");
		logger.info(MenuString);
		model.addAttribute("MainMenuTree", MenuString);
		return "/frame/main_menu";
	}
}
