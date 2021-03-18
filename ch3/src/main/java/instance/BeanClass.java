/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package instance;

/**
 * @author shaozk
 * @Description: 构造方法实例化
 */
public class BeanClass {
    public String message;
    public BeanClass() {
        message = "构造方法实例化Bean";
    }
    public BeanClass(String s) {
        message = s;
    }
}
