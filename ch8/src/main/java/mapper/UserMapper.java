/*
 * Date: 2021/4/24
 * Author: <https://www.github.com/shaozk>
 */

package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import pojo.MUser;

import java.util.List;

/**
 * @author shaozk
 * @Description: TODO
 */
@Repository
@Mapper
public interface UserMapper {
    // 添加用户
    public int addUser(MUser user);
    // 删除用户
    public int deleteUser(int id);
    // 修改用户信息
    public int updateUser(MUser user);
    // 查询用户
    public MUser queryUserById(Integer id);
    // 根据用户名茶渣
    public MUser queryUserByName(String name);
    // 查询所有用户
    public List<MUser> queryAllUser();
}
