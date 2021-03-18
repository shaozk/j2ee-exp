/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package instance;

/**
 * @author shaozk
 * @Description: 实例工厂实例化
 */
public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用实例工厂方法实例化Bean");
    }

}
