/*
 * Date: 2021/3/18
 * Author: <https://www.github.com/shaozk>
 */

package life;

/**
 * @author shaozk
 * @Description: Bean的声明周期
 */
public class BeanLife {
    public void initMyself() {
        System.out.println(this.getClass().getName() + "自定义初始化方法");
    }

    public void destroyMyself() {
        System.out.println(this.getClass().getName() + "自定义销毁方法");
    }
}
