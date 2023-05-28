package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author 曹飞羽
 * @create 2023/2/2 18:26
 */
public class SqlSessionUtil {
    /**
     * 为了防止创建对象  构造方法私有化
     */
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSessionUtil(){}
    //类加载时执行
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//全局的Thread
    private static ThreadLocal<SqlSession> local = new ThreadLocal<SqlSession>();
    /**
     *获取会话对象
     * @return 会话对象
     */
    public static SqlSession openSession(){
        SqlSession sqlSession = local.get();
        if (sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
            local.set(sqlSession);
        }
        return sqlSession;
    }
    public static void close(SqlSession sqlSession){
        if (sqlSession != null) {
            sqlSession.close();
            local.remove();
        }
    }
}
