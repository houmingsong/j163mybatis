package com.lovo.j163mybatis.mapper;

import java.util.List;

import com.lovo.j163mybatis.bean.HomeBean;

public interface HomeMapper {
	
	public HomeBean getHomeById(int id);
	
	public List<HomeBean> getAllHome();
}
