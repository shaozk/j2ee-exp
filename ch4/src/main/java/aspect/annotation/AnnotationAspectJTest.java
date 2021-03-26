/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package aspect.annotation;

import configuration.AspectConfiguration;
import dynamic.jdk.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shaozk
 * @Description: TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= AspectConfiguration.class)
public class AnnotationAspectJTest {

    @Autowired
    private TestDao dao;


    @Test
    public void testAdd(){
        dao.save();
    }
}
