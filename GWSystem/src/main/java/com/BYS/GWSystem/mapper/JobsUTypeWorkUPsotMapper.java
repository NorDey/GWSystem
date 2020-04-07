package com.BYS.GWSystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.BYS.GWSystem.dto.*;

@Mapper
public interface JobsUTypeWorkUPsotMapper {
	//联表更新某一个招聘信息
	public int updateOneMSG(CompanyHiredInfoDto HiredInfo);
	//联表查询某一个招聘信息
	public CompanyHiredInfoDto searchOne(@Param(value="postId") String postId);
	
	//新建一个招聘信息
	public int insertNewJobs(CompanyHiredInfoDto greeting);
	public int insertNewJobs2(CompanyHiredInfoDto greeting);
	//统计数目
	public String count();
	//寻一个
	public String selectOne(@Param(value="postName") String postName);
}
