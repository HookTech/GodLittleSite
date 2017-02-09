package com.unionpay.logical.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.unionpay.logical.bean.TheologyPrimer;
import com.unionpay.logical.mapper.TheologyPrimerMapper;

import com.alibaba.fastjson.JSON;

@Service
public class TheologyServiceImpl implements TheologyService{
	
	@Resource
	private TheologyPrimerMapper theologyPrimerMapper;

	@Override
	public List<TheologyPrimer> getTheologyPrimer() {
		return theologyPrimerMapper.selectAll();
	}

	@Override
	public String getTheologyPrimerJsonStr() {
		return JSON.toJSONString(this.getTheologyPrimer());
	}

	@Override
	public List<TheologyPrimer> getTheologyPrimerByParam(
			Map<String, String> params) {
		if(params.size() == 2&&params.containsKey("startNum")&&params.containsKey("pageSize")){
			return theologyPrimerMapper.selectByPage(Integer.valueOf(params.get("startNum")), Integer.valueOf(params.get("pageSize")));
		}
		else
			return new ArrayList<TheologyPrimer>();
	}

	@Override
	public int countTotalNum(Map<String, String> params) {
		return theologyPrimerMapper.countNum(params);
	}
}
