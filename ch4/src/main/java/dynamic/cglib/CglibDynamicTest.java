/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dynamic.cglib;

/**
 * @author shaozk
 * @Description: TODO
 */
public class CglibDynamicTest {
    public static void main(String[] args) {
        // 创建代理对象
        CglibDynamicProxy cdp = new CglibDynamicProxy();
        TestDao dao = new TestDao();
        TestDao testDaoAdvice = (TestDao) cdp.createProxy(dao);
        // 执行方法
        testDaoAdvice.save();
        System.out.println("==========");
        testDaoAdvice.modify();
        System.out.println("==========");
        testDaoAdvice.delete();

    }
}
