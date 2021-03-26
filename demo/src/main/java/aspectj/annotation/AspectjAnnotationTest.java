package aspectj.annotation;

//import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;

public class AspectjAnnotationTest {
	public static void main(String[] args) {

		ApplicationContext appCon = new ClassPathXmlApplicationContext("annApplicationContext.xml");

		//从容器中获取到目标对象（被切类）
		TestDao testDao = (TestDao) appCon.getBean("testDao");

		//给目标对象方法参数传参
		testDao.visitdao("agree");
	}

}

