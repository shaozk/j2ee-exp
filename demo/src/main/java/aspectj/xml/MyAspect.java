package aspectj.xml;


import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	/**
	 * ������ֵΪ��agree��ʱ�ſ��Է���
	 */
	public void before(JoinPoint pjp) throws Throwable{
		System.out.println("====����XML������ʽAspectJ��ǰ��֪ͨ====");
		
		//��ȡ��ǰ���󷽷��Ĳ���ֵ
		Object[] args = pjp.getArgs();
		
		if(args[0].toString().equals("agree")) {
			System.out.println("����ɹ���");
			
			//ִ��Ŀ����ķ���(�˴�����Ҫ�׳��쳣)
//			Object obj = pjp.proceed();
			
		}else {
			System.out.println("����ʧ�ܣ��ܾ����ʣ�");
//			����ǰ��֪ͨ�������ڷ���ִ��ǰ������Ϊ�˷�ֹ��ִ��visitdao���˴��׳�һ���쳣
//			System.exit(-1);
			if(true) {
			    throw new Exception("�Ƿ�����"); 
			}
	
		}
	}
	
}
