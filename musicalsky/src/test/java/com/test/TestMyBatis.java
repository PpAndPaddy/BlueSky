package com.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.musicalsky.entity.AdminLogin;
import com.musicalsky.service.AdminLoginService;
import com.sun.istack.internal.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class) //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class TestMyBatis{
	
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private AdminLoginService adminLoginService = null;
	
/*	private ApplicationContext ac = null;
	
	@Before  
	public void before() {
		
	    ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
	    adminLoginService = (AdminLoginService) ac.getBean("adminLoginService");  
	}  */
	
	@Test
	public void test(){
		
		AdminLogin adminL = adminLoginService.testMybatis("admin");
		logger.info(adminL.toString());
		
	}
	
}










