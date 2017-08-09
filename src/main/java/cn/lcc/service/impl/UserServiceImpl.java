package cn.lcc.service.impl;

import cn.lcc.dao.UserDao;
import cn.lcc.domain.User;
import cn.lcc.service.UserService;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by abbot on 2017/7/1 0001.
 */
@Repository(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUser(String username) {
        return userDao.findUser(username);
    }
}
