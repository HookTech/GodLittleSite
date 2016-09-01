package com.unionpay.core.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.unionpay.core.bean.*;

@Repository
public interface MainMenuMapper {
	List<MainMenu> getMainMenuList();
}
