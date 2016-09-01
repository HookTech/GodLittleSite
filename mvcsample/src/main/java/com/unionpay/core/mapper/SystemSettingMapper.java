package com.unionpay.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.unionpay.core.bean.*;

@Repository
public interface SystemSettingMapper {
	SystemSetting getSystemSettingBySystemCode(@Param("systemCode")String code);
}
