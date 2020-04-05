package com.BYS.GWSystem.service;

import java.util.List;

import com.BYS.GWSystem.model.*;
import com.github.pagehelper.Page;

public interface IPostService {
	// 招聘信息关注率
	public Double AttentionRateOfRecruitmentInformation();

	// 查询工作岗位简要信息
	public List<Post> jobList(String registrationId);

	public Page<Post> jobListPage(String registrationId);

	// 删除岗位信息
	public int deleteOneHired(String postId);

	// 按postID查询一条
	public Post selectOneHiredMsg(String postId);

	// 查询一共多少post
	public int count();

	// 是否存在这个fatherID存在这个fatherID是多少
	public Integer seletExeists(String pro);

	// 分配一个FID的最大值
	public int seletMaxFID();

	// 分配一个FID的最大值//是否存在这个fatherID存在这个fatherID是多少
	public String toGetFid(String profession);

	// 是否存在这个TID存在这个TID是多少
	public Integer seletTExeists(String postNmae);

	// 分配一个TID的最大值
	public int seletMaxTID();

	// 分配一个TID的最大值//是否存在这个TID存在这个TID是多少
	public Integer toGetTid(String postName);
}
