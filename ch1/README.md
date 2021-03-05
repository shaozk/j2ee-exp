# ʵ��01�����������
## ʵ��Ŀ��
* Spring������ʶ

##ʵ������
* �����������JDK+Eclipse+Tomcat+MySQL����
* ����Spring�����������������ĵ�������������
* ʵ���̲�P9-11 Spring���ų���

## Դ����
** 1.TestDao **

```java
package dao;

public interface TestDao {
    public void sayHello();
}

```
** 2.TestDaoImple **

```java
package dao.impl;

import dao.TestDao;

public class TestDaoImpl implements TestDao {
    @Override
    public void sayHello() {
        System.out.println("hello spring !!");
    }
}

```

** 3.Test **

```java
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
```

** 4.applicationContext.xml **

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
		http://www.springframework.org/schema/beans/spring-beans.xsd">
	<!-- ��ָ��TestDaoImpl���ø�spring����spring������ʵ�� -->
	<bean id="test" class="dao.impl.TestDaoImpl"/>
</beans>
```


## ���н�ͼ
![ch1���н�ͼ](../images/ch1���н�ͼ.png)

