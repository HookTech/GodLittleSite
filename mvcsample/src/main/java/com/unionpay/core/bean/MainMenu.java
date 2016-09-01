package com.unionpay.core.bean;

import com.alibaba.fastjson.*;

public class MainMenu {
	private Integer menuPid;
	
	private String menuName;
	
	private Integer menuParentPid;
	
	private String menuUrl;
	
	private Integer menuOrder;

	public Integer getMenuPid() {
		return menuPid;
	}

	public void setMenuPid(Integer menuPid) {
		this.menuPid = menuPid;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getMenuParentPid() {
		return menuParentPid;
	}

	public void setMenuParentPid(Integer menuParentPid) {
		this.menuParentPid = menuParentPid;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
}
