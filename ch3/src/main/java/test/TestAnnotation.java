/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package test;

import annotation.AnnotationUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shaozk
 * @Description: TODO
 */
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationContext.xml");
        AnnotationUser au = (AnnotationUser) applicationContext.getBean("annotationUser");
        System.out.println(au.getUname());
    }
}
