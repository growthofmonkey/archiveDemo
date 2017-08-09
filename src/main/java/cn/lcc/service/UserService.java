package cn.lcc.service;

import cn.lcc.domain.User;

/**
 * Created by abbot on 2017/7/1 0001.
 */
public interface UserService {
    public User findUser(String username);
}
