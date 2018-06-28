package org.song.mybatis.service;

import java.util.List;

import org.song.mybatis.entity.User;
import org.song.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;

@Service
@org.springframework.stereotype.Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> searchAllUser(){
		return userMapper.selectAll();
	}

}
