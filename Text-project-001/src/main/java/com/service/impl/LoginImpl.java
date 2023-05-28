package com.service.impl;
import com.mapper.UserMapper;
import com.pojo.User;
import com.service.Login;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class LoginImpl implements Login {

    public boolean login(String username, String password) {
        boolean success = false;
        SqlSession sqlSession = SqlSessionUtil.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        if (mapper.selectLogin(username, password)!= null){
            success = true;
        }
        SqlSessionUtil.close(sqlSession);
        return success;
    }

    public boolean newUser(User user) {
        boolean success = false;
        SqlSession sqlSession = SqlSessionUtil.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        if(mapper.insertUser(user)>0){
            success = true;
            sqlSession.commit();
            SqlSessionUtil.close(sqlSession);
        }
        SqlSessionUtil.close(sqlSession);
        return success;
    }

    public User selectUser(String user) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User a = mapper.selectByIdName(user);
        SqlSessionUtil.close(sqlSession);
        return a;
    }
}
