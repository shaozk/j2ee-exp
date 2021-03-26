package aspectj.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;

public class XMLAspectJTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try{
		
		//从xml加载容器
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/xml/applicationContext.xml");
		
		//从容器中获取到目标对象（被切类）
		TestDao testDao = (TestDao)appCon.getBean("testDao");
		
		//给目标对象方法参数传参
		testDao.visitdao("agree");
		testDao.visitdao("Topus");
		}catch(Exception e){
            System.out.println("出现异常："+e);    //打印异常信息
//            e.printStackTrace();            //打印完整的异常信息
	}
}
}
