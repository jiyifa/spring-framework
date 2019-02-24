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
