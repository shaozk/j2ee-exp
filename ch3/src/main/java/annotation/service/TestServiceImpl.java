/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package annotation.service;

import annotation.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shaozk
 * @Description: TODO
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService{
    @Resource(name = "testDaoImpl") // 相当与@Autowried
    private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("TestService save()");
    }
}
