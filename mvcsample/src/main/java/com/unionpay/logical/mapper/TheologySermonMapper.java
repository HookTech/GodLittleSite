package com.unionpay.logical.mapper;

import com.unionpay.logical.bean.TheologySermon;

public interface TheologySermonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TheologySermon record);

    int insertSelective(TheologySermon record);

    TheologySermon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TheologySermon record);

    int updateByPrimaryKey(TheologySermon record);
}