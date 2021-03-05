package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.TestDao;

public class Test {
	public static void main(String[] args) {
		// ��ʼ��Spring����ApplicationContext�����������ļ�
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ͨ��������ȡtestʵ��
		TestDao testDao = (TestDao) app.getBean("test");	// testΪ�����ļ��е�id
		testDao.sayHello();
	}

}
