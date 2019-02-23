package com.springproject;

import com.springproject.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringProjectTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)factory.getBean("student");
		System.out.println(student.toString());
	}
}
