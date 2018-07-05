package org.song.redis.service;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.song.common.redis.entity.RUser;
import org.song.common.redis.service.UserService;
import org.song.redis.RedisKeyPrefix;
import org.springframework.data.redis.core.RedisTemplate;

import com.alibaba.dubbo.config.annotation.Service;

@Service
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService{
	
	@Resource
	RedisTemplate redisTemplate;
	
	@SuppressWarnings("unchecked")
	@Override	
	public void addUser(){
		RUser user = new RUser();
		user.setId(1L);
		user.setName("张三");
		redisTemplate.opsForValue().set(RedisKeyPrefix.USER + 1L, user, 3000, TimeUnit.MILLISECONDS);
		RUser u1 = (RUser) redisTemplate.opsForValue().get(RedisKeyPrefix.USER + 1L);
		System.out.println(u1 != null ? u1.getName(): "");
		System.out.println("======");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		RUser u2 = (RUser) redisTemplate.opsForValue().get(RedisKeyPrefix.USER + 1L);
		System.out.println(u2 != null ? u2.getName(): "");
	}

}
