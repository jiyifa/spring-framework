package com.springproject.aop.service;

import com.springproject.model.Member;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MemberManagerService {
	private final static Logger LOG = LogManager.getLogger(MemberManagerService.class.getName());

	/**
	 *
	 * @param member
	 * @return
	 */
	public boolean add(Member member){
		LOG.info("增加用户");
		return true;
	}


	public boolean remove(long id) throws Exception{
		LOG.info("删除用户");
		throw new Exception("这是自己抛出的异常");
	}

	public boolean modify(Member member){
		LOG.info("修改用户");
		return true;
	}

	public boolean query(String loginName){
		LOG.info("查询用户");
		return true;
	}
}
