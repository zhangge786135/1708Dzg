package com.zhangge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangge.entity.Slide;
import com.zhangge.mapper.SlideMapper;

@Service
public class SlideServiceImp implements SlideService {

	@Autowired
	private SlideMapper slideMapper;

	@Override
	public List<Slide> querySlide() {
		// TODO Auto-generated method stub
		return slideMapper.querySlide();
	}

}
