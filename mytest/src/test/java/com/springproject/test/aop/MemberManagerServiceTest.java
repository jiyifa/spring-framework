package com.springproject.test.aop;


import com.springproject.aop.service.MemberManagerService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MemberManagerServiceTest {
	@Autowired
	MemberManagerService memberManagerService;
	@Test
	@Ignore
	public void testAdd(){
		memberManagerService.add(null);
	}

	//做事务代理的时候
	//TransactionManager来管理事务操作（切面）
	//DataSource,SessionFactory(DataSource)
	//DataSource包含了连接信息，事务的提交，回滚的一些基础功能
	//通过连接点可以获取到方法（切点）具体哪个DataSource
	//根据切面的通知类型，去执行DataSource的功能方法
	@Test
	public void testRemove(){
		try {
			memberManagerService.remove(0);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	public void testModify(){
		memberManagerService.modify(null);
	}

	public void testQuery(){
		memberManagerService.query("");
	}
}
