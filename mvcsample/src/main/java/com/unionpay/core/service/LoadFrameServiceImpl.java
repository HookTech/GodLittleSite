package com.unionpay.core.service;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.unionpay.common.util.MainMenuTree;
import com.unionpay.core.bean.*;
import com.unionpay.core.mapper.*;

@Service
public class LoadFrameServiceImpl implements LoadFrameService{
	
	@Resource
	private SystemSettingMapper sysSetMapper;
	@Resource
	private MainMenuMapper mainMenuMapper;
	
	public SystemSetting getSystemSetting(String systemCode) {
		return sysSetMapper.getSystemSettingBySystemCode(systemCode);
	}

	public List<MainMenu> getMainMenuList() {
		return mainMenuMapper.getMainMenuList();
	}

	public MainMenuTree getMainMenuListToTree() {
		return new MainMenuTree(getMainMenuList());
	}

	public String getMainMenusString() {
		return getMainMenuListToTree().toJsonString();
	}

}
