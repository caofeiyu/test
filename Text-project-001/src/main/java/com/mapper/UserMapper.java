package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Param;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserMapper {
    /**
     * 通过账号密码验证
     * @param eMail
     * @param password
     * @return 查询到条数
     */
    User selectLogin(@Param("eMaiL") String eMail, @Param("password") String password);

    /**
     * 注册用户，向用户表插入数据
     * @param user
     * @return 插入条数
     */
    int insertUser(User user);

    /**
     *
     * @return
     */
    List<User> select();

    /**
     * 查询用户信息
     * @param user
     * @return
     */
    User selectByIdName(String user);
}
