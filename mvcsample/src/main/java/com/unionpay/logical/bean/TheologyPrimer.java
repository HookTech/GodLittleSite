package com.unionpay.logical.bean;

import java.util.Date;

import com.alibaba.fastjson.JSON;

public class TheologyPrimer extends CommonBean{
	
    private Integer id;

    private String title;

    private String intro;

    private String type;

    private String url;
    
    private Date createTime;

    private Date updateTime;
    
    private String createTimeStr;
    
    private String updateTimeStr;
    
    public String getCreateTimeStr() {
		return dateFormat.format(getCreateTime());
	}

	public String getUpdateTimeStr() {
		return dateFormat.format(getUpdateTime());
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
    
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Override
    public String toString(){
    	return JSON.toJSONString(this);
    }
}