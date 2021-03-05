package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dao.TestDao;

public class Test {
	public static void main(String[] args) {
		// 初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 通过容器获取test实例
		TestDao testDao = (TestDao) app.getBean("test");	// test为配置文件中的id
		testDao.sayHello();
	}

}
