package org.Vote.test;

import java.util.List;

import org.Vote.dao.SubjectDao;
import org.Vote.pojo.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void testGetAll() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mybatis.xml");
		SubjectDao dao = (SubjectDao) context.getBean("subjectDao"); 
		List<Subject> list = dao.getAll();
		for (Subject subject : list) {
			System.out.println("shi"+subject.getOptions());
		}
	}
	@org.junit.Test
	public void testfaqitoupiao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mybatis.xml");
		SubjectDao dao = (SubjectDao) context.getBean("subjectDao"); 
		List<Subject> list = dao.getAll();
		for (Subject subject : list) {
			System.out.println("shi"+subject.getOptions());
		}
	}
}
