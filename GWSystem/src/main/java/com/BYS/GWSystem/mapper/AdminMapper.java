package com.BYS.GWSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.BYS.GWSystem.model.Admin;

@Mapper
public interface AdminMapper  {

	public List<Admin> selectAdminList();
	
}