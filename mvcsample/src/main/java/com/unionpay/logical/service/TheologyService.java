package com.unionpay.logical.service;

import java.util.List;
import java.util.Map;

import com.unionpay.logical.bean.*;

public interface TheologyService {
	/**
     * 按筛选条件筛选,包括分页信息
     * */
    List<TheologyPrimer> getTheologyPrimerByParam(Map<String,String> params);
	
	List<TheologyPrimer> getTheologyPrimer();
	/**
	 * 按筛选条件统计记录总数
	 * */
	int countTotalNum(Map<String,String> params);
	
	String getTheologyPrimerJsonStr();
}
