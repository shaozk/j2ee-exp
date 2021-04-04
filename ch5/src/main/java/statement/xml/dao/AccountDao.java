/*
 * Date: 2021/4/2
 * Author: <https://www.github.com/shaozk>
 */

package statement.xml.dao;

/**
 * @author shaozk
 * @Description: 账户转账接口
 */
public interface AccountDao {
    // 添加用户
    public void addUser(String user, int money);
    // 汇款
    public void out(String outUser, int money);
    // 收款
    public void in(String inUser, int money);
}
