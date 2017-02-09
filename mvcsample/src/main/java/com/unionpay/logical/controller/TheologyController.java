package com.unionpay.logical.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.unionpay.common.log.LogWriter;
import com.unionpay.core.controller.CommonController;
import com.unionpay.logical.service.TheologyService;

@Controller
@RequestMapping("theology")
public class TheologyController extends CommonController{
	
//	private static final Logger logger = Logger.getLogger(TheologyController.class);
	
	@Autowired
	TheologyService theologyService;
	//分页中每页显示的记录数
	final int pageSize = 10;
	//分页控件中显示的页数量
	final int blockSize = 7;
	/**
	 * 计算记录开始数
	 * */
	private String calculateStartNum(Integer pageSize,Integer pageNum){
		return String.valueOf(pageSize*(pageNum-1));
	}
	/**
	 * 所属区间编号从0开始 sample 1~5:#0;6~10:#1;
	 * */
	private int belongBlock(int seq,int size){
//		if(seq%size == 0)
//			return seq/size - 1;
//		else
//			return seq/size;
		return seq/(size+1);
	}
	
	/**
	 * 全页面刷新获取记录
	 * */
	@RequestMapping(value="primer",method=RequestMethod.GET)
	public String getTheologyPrimer(@RequestParam(value="pageNum",required=false) String pageNum,Model model){
		Map<String,String> filterParams = new HashMap<String,String>();
		//这里可以加入筛选条件，如按标题模糊查询等等
		int totalRecordNum = theologyService.countTotalNum(filterParams);//总记录数
		int maxPageNum = totalRecordNum/pageSize + 1;//总页面数
		int maxBlockNum = maxPageNum/blockSize + 1;//分页控件中总的块数量
		filterParams.put("pageSize", String.valueOf(pageSize));
		if(pageNum!=null){
			filterParams.put("startNum", calculateStartNum(Integer.valueOf(pageSize),Integer.valueOf(pageNum)));
			int currentPage = Integer.valueOf(pageNum);
			model.addAttribute("currentPage", currentPage);
			int block = belongBlock(currentPage,blockSize);
			int blockSeqNum = block + 1;//在分页控件中第几个块,从第1个开始
			int blockStartNum = block * blockSize + 1;//分页控件中的开始页
			int blockEndNum = (blockStartNum + blockSize - 1)>maxPageNum?maxPageNum:(blockStartNum + blockSize - 1);//分页控件中的结束页
			model.addAttribute("blockStartNum", blockStartNum);
			model.addAttribute("blockEndNum", blockEndNum);
			model.addAttribute("blockSeqNum", blockSeqNum);
		}
		else{
			filterParams.put("startNum", "0");
			model.addAttribute("currentPage", 1);
			model.addAttribute("blockStartNum", 1);
			model.addAttribute("blockEndNum", blockSize);
			model.addAttribute("blockSeqNum", 1);
		}
		LogWriter.info("当前页面:"+ pageNum);
		LogWriter.info("limit start:"+ filterParams.get("startNum"));
		model.addAttribute("mStrList", theologyService.getTheologyPrimerByParam(filterParams));
		model.addAttribute("maxPageNum", maxPageNum);
		model.addAttribute("maxBlockNum", maxBlockNum);
		return "/logical/theology/theology_primer";
	}
	/**
	 * ajax异步请求记录
	 * TODO 二期需求,当该页面有很多元素开始影响性能时可以考虑
	 * */
	@RequestMapping(value="primer",method=RequestMethod.POST,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getTheologyPrimerStr(@RequestParam(value="pageNum",required=false) String pageNum){
		Map<String,String> filterParams = new HashMap<String,String>();
		filterParams.put("pageSize", String.valueOf(pageSize));
		if(pageNum!=null)
			filterParams.put("startNum", calculateStartNum(Integer.valueOf(pageSize),Integer.valueOf(pageNum)));
		else
			filterParams.put("startNum", "0");
		return JSON.toJSONString(theologyService.getTheologyPrimerByParam(filterParams));
	}
}
