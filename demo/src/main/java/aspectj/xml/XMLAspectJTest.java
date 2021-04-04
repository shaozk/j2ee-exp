package aspectj.xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.TestDao;

public class XMLAspectJTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try{
		
		//��xml��������
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/xml/applicationContext.xml");
		
		//�������л�ȡ��Ŀ����󣨱����ࣩ
		TestDao testDao = (TestDao)appCon.getBean("testDao");
		
		//��Ŀ����󷽷���������
		testDao.visitdao("agree");
		testDao.visitdao("Topus");
		}catch(Exception e){
            System.out.println("�����쳣��"+e);    //��ӡ�쳣��Ϣ
//            e.printStackTrace();            //��ӡ�������쳣��Ϣ
	}
}
}
