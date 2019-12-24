package com.zhangge.service;

import java.util.List;

import com.zhangge.entity.Channel;
import com.zhangge.entity.User;

public interface UserService {
	public User login(User user);// 登录
	public List<Channel> queryChannel();//查询频道显示在home.jsp
}
