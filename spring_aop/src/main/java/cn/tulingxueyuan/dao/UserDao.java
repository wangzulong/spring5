package cn.tulingxueyuan.dao;

import cn.tulingxueyuan.beans.Role;
import cn.tulingxueyuan.beans.User;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public interface UserDao {

    User get(Integer id);

    void add(User user);

    void delete(Integer id);

    void update(User user);
}
