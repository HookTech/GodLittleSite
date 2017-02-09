package com.unionpay.logical.bean;

import java.util.Date;

public class TheologySermon extends CommonBean{
    private Integer id;

    private String sermonHeader;

    private String sermonTheme;

    private Date sermonTime;

    private String sermonSpeaker;

    private String sermonAudioType;

    private String sermonAudioUrl;

    private String sermonVedioType;

    private String sermonVedioUrl;

    private String sermonDocType;

    private String sermonDocUrl;

    private Date createTime;

    private Date updateTime;
    
    private String sermonTimeStr;
    
    private String createTimeStr;
    
    private String updateTimeStr;
    
    public String getSermonTimeStr() {
		return dateFormat.format(getSermonTime());
	}

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

    public String getSermonHeader() {
        return sermonHeader;
    }

    public void setSermonHeader(String sermonHeader) {
        this.sermonHeader = sermonHeader == null ? null : sermonHeader.trim();
    }

    public String getSermonTheme() {
        return sermonTheme;
    }

    public void setSermonTheme(String sermonTheme) {
        this.sermonTheme = sermonTheme == null ? null : sermonTheme.trim();
    }

    public Date getSermonTime() {
        return sermonTime;
    }

    public void setSermonTime(Date sermonTime) {
        this.sermonTime = sermonTime;
    }

    public String getSermonSpeaker() {
        return sermonSpeaker;
    }

    public void setSermonSpeaker(String sermonSpeaker) {
        this.sermonSpeaker = sermonSpeaker == null ? null : sermonSpeaker.trim();
    }

    public String getSermonAudioType() {
        return sermonAudioType;
    }

    public void setSermonAudioType(String sermonAudioType) {
        this.sermonAudioType = sermonAudioType == null ? null : sermonAudioType.trim();
    }

    public String getSermonAudioUrl() {
        return sermonAudioUrl;
    }

    public void setSermonAudioUrl(String sermonAudioUrl) {
        this.sermonAudioUrl = sermonAudioUrl == null ? null : sermonAudioUrl.trim();
    }

    public String getSermonVedioType() {
        return sermonVedioType;
    }

    public void setSermonVedioType(String sermonVedioType) {
        this.sermonVedioType = sermonVedioType == null ? null : sermonVedioType.trim();
    }

    public String getSermonVedioUrl() {
        return sermonVedioUrl;
    }

    public void setSermonVedioUrl(String sermonVedioUrl) {
        this.sermonVedioUrl = sermonVedioUrl == null ? null : sermonVedioUrl.trim();
    }

    public String getSermonDocType() {
        return sermonDocType;
    }

    public void setSermonDocType(String sermonDocType) {
        this.sermonDocType = sermonDocType == null ? null : sermonDocType.trim();
    }

    public String getSermonDocUrl() {
        return sermonDocUrl;
    }

    public void setSermonDocUrl(String sermonDocUrl) {
        this.sermonDocUrl = sermonDocUrl == null ? null : sermonDocUrl.trim();
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
}