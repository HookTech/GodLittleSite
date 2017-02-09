package com.unionpay.logical.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.unionpay.logical.bean.TheologyPrimer;

@Repository
public interface TheologyPrimerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TheologyPrimer record);

    int insertSelective(TheologyPrimer record);

    TheologyPrimer selectByPrimaryKey(Integer id);
    
    List<TheologyPrimer> selectAll();
    /**
     * 查询分页的记录
     * */
    List<TheologyPrimer> selectByPage(@Param("startNum") Integer startNum,@Param("pageSize") Integer pageSize);
    /**
     * 查询总的数量
     * */
    int countNum(Map<String,String> params);

    int updateByPrimaryKeySelective(TheologyPrimer record);

    int updateByPrimaryKey(TheologyPrimer record);
}