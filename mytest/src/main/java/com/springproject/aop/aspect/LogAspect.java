package com.springproject.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

;

public class LogAspect {
	private final static Logger LOG = LogManager.getLogger(LogAspect.class);
	public void before(JoinPoint joinpoint){
		LOG.info("调用方法之前执行"+joinpoint);
	}

	public void after(JoinPoint joinpoint){
		LOG.info("调用方法之后执行"+joinpoint);
	}
	public void afterReturnen(JoinPoint joinpoint){
		LOG.info("调用获得返回值之后执行"+joinpoint);
	}

	public void afterThrow(JoinPoint joinpoint){
		LOG.info("抛出异常之后"+joinpoint);
	}
}
