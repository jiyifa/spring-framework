package com.springproject.aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect//这个类被声明为是一个需要动态织入到我们的虚拟切面的类
public class AnnotationAspect {
	private final static Logger LOG = LogManager.getLogger(AnnotationAspect.class);

	/**
	 * 声明切点
	 * 因为要利用反射机制去读取这个切面中的所有注解信息
	 */
	@Pointcut("execution(* com.springproject.aop.service..*(..))")
	public void pointcutConfig(){}

	@Before("pointcutConfig()")
	public void before(JoinPoint joinpoint){
		LOG.info("调用方法之前执行"+joinpoint);
	}

	@After("pointcutConfig()")
	public void after(JoinPoint joinpoint){
		LOG.info("调用方法之后执行"+joinpoint);
	}
	@AfterReturning("pointcutConfig()")
	public void afterReturnen(JoinPoint joinpoint){
		LOG.info("调用获得返回值之后执行"+joinpoint);
	}
	@AfterThrowing("pointcutConfig()")
	public void afterThrow(JoinPoint joinpoint){
		System.out.println("切点的参数："+ Arrays.toString(joinpoint.getArgs()));
		System.out.println("切点的方法："+ joinpoint.getKind());
		System.out.println(joinpoint.getSignature());
		System.out.println(joinpoint.getTarget());//生成以后的代理对象
		System.out.println(joinpoint.getThis());
		LOG.info("抛出异常之后"+joinpoint);
	}
}
