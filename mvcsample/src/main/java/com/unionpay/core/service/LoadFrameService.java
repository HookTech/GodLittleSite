package com.unionpay.core.service;

import java.util.List;

import com.unionpay.common.util.MainMenuTree;
import com.unionpay.core.bean.*;

public interface LoadFrameService {
	/**
	 * 根据系统代号得到系统的信息
	 * @param systemCode 系统的代号
	 * @return SystemSetting类
	 */
	SystemSetting getSystemSetting(String systemCode);
	/**
	 * 得到主目录的信息（包括1级和多级目录树）
	 */
	List<MainMenu> getMainMenuList();
	
	MainMenuTree getMainMenuListToTree();
	/**
	 * 得到主目录的json字符串
	 */
	String getMainMenusString();
	
}
