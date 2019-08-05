package dao;

import org.apache.ibatis.annotations.Param;
import pojo.User;

public interface UserDao {
    User findUser(@Param("id")String id);
}
