package com.zhangge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangge.entity.Channel;
import com.zhangge.entity.User;
import com.zhangge.mapper.ChannelMapper;
import com.zhangge.mapper.UserMapper;
import com.zhangge.util.MD5Util;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private ChannelMapper channelMapper;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String md5Str = MD5Util.getMD5Str(user.getPassword());
		user.setPassword(md5Str);
		return userMapper.login(user);
	}

	@Override
	public List<Channel> queryChannel() {
		// TODO Auto-generated method stub
		return channelMapper.queryChannel();
	}

}
