/*
 * Date: 2021/4/4
 * Author: <https://www.github.com/shaozk>
 */

package statement.annotation.dao;

/**
 * @author shaozk
 * @Description: TODO
 */
public interface TAccountDao {
    // 汇款
    public void out(String outUser, int money);
    // 收款
    public void in(String inUser, int money);
}
