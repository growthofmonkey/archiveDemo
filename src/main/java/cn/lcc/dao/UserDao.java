package cn.lcc.dao;

import cn.lcc.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by abbot on 2017/7/1 0001.
 */
@Repository(value = "userDao")
public interface UserDao {
    public User findUser(String username);
}
