package com.service.impl;

import com.mapper.NewsMapper;
import com.pojo.News;
import com.service.TableNewsService;
import com.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TableNewsServiceImpl implements TableNewsService {
    /**
     * 进行新闻的查询
     * @return List<News>
     */
    public List<News> Table(String user) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        List<News> select = mapper.select(user);
        SqlSessionUtil.close(sqlSession);
        return select;
    }

    public List<News> TableById(String id, String title) {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        List<News> news = mapper.selectByTitle(id,title);
        SqlSessionUtil.close(sqlSession);
        return news;
    }

    /**
     * 增加新闻
     * @return success
     */
    public boolean insertNews(News news) {
        boolean success = false;
        SqlSession sqlSession = SqlSessionUtil.openSession();
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        int insert = mapper.insert(news);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        if (insert==1){
            success = true;
        }

        return success;
    }

    public boolean deleteByTitle(String id, String title) {
        boolean success = false;
        SqlSession sqlSession = SqlSessionUtil.openSession();
        NewsMapper mapper = sqlSession.getMapper(NewsMapper.class);
        int i = mapper.deleteByTitle(title, id);
        if (i==1){
            success = true;
        }
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        return success;
    }
}
