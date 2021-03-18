/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package instance;

/**
 * @author shaozk
 * @Description: 静态工厂实例化
 */
public class BeanStaticFactory {
    private static BeanClass beanInstance = new BeanClass("调用静态工厂方法实例化Bean");
    public static BeanClass createInstance() {
        return beanInstance;
    }
}
