package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.dao.UserDao;
import cn.tulingxueyuan.service.BaseService;
import cn.tulingxueyuan.service.RoleService;
import cn.tulingxueyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Service    //userServiceImpl
//@Primary    //设置自动注入的主要Bean
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    public void getBean() {
        System.out.println("UserServiceImpl");
        userDao.getUser();
    }
}
