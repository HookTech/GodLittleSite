package com.unionpay.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

import com.unionpay.core.bean.*;
/**
 * 封装MainMenu的类结构，方便传到前端
 */
public class MainMenuTree {
	
	MainMenuNode root;
	
	private class MainMenuNode{
		public Integer pid;
		public MainMenu context;
		public MainMenuNode parent;
		public List<MainMenuNode> children; 
		
		public MainMenuNode(Integer pid,MainMenu context,MainMenuNode parent){
			this.pid = pid;
			this.context = context;
			this.parent = parent;
			children = new ArrayList<MainMenuNode>();
		}
		@Override
		public String toString(){
			return "{"+pid.toString()+":"+ context.toString() +"}";
		}
		
		public void addToParentNode(MainMenuNode parentNode){
			this.parent = parentNode;
			parentNode.children.add(this);
		}
	}
	
	/**
	 * 从平面的List转化为Tree结构
	 */
	public MainMenuTree(List<MainMenu> rawList){
		root = new MainMenuNode(0,null,null);
		Map<Integer,MainMenuNode> mass = new WeakHashMap<Integer,MainMenuNode>();
		mass.put(0, root);
		//建索引复杂度为O(n)
		for(MainMenu oo : rawList)
			mass.put(oo.getMenuPid(), new MainMenuNode(oo.getMenuPid(),oo,null));
		//挂树节点复杂度为O(n)
		for(Entry<Integer,MainMenuNode> it : mass.entrySet()){
			if(0 != it.getKey()){
				MainMenuNode cur = it.getValue();
				MainMenuNode par = mass.get(it.getValue().context.getMenuParentPid());
				cur.addToParentNode(par);
			}
		}
		
	}
	
	private String recursivePrintNode(MainMenuNode node){
		StringBuilder buff = new StringBuilder();
		int size = node.children.size();
		if(0 != size){
			buff.append("{").append(node.pid).append(":");
			buff.append("[");
			for(int i = 0; i < size; i++){
				if(i != size - 1)
					buff.append(recursivePrintNode(node.children.get(i))).append(",");
				else
					buff.append(recursivePrintNode(node.children.get(i)));
			}
			buff.append("]");
			buff.append("}");
		}
		else
			buff.append(node.toString());
		return buff.toString();
	}
	
	/**
	 * 最后外部调用该方法形成json，传给前台
	 */
	public String toJsonString(){
		return recursivePrintNode(root);
	}
	
}
