/*
 * Date: 2021/3/26
 * Author: <https://www.github.com/shaozk>
 */

package dynamic.jdk;

/**
 * @author shaozk
 * @Description: TODO
 */
public class JDKDynamicTest {
    public static void main(String[] args) {
        // 创建代理对象
        JDKDynamicProxy jdkDynamicProxy = new JDKDynamicProxy();
        // 创建目标对象
        TestDao testDao = new TestDaoImpl();

        TestDao testDaoAdvice = (TestDao) jdkDynamicProxy.createProxy(testDao);

        // 执行方法
        testDaoAdvice.save();
        System.out.println("==========");
        testDaoAdvice.modify();
        System.out.println("==========");
        testDaoAdvice.delete();
    }
}
