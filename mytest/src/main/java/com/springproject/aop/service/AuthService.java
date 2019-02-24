package com.springproject.aop.service;

import com.springproject.model.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
	private final static Logger LOG = LogManager.getLogger(AuthService.class.getName());
	public Member login(String loginName, String loginPass){
		LOG.info("用户登录");
		return null;
	}

	public boolean logout(String loginName){
		LOG.info("注销登录");
		return true;
	}
}
