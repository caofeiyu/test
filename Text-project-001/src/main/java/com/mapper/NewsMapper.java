package com.mapper;

import com.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    /**
     * 查询新闻
     * @return 新闻的所有信息
     */
    List<News> select(String user);

    /**
     * 通过title查询新闻详情
     * @param title
     * @param id
     * @return
     */
    List<News> selectByTitle(@Param("id") String id,@Param("title") String title);

    /**
     * 向新闻数据库插入数据
     * @param news
     * @return 插入条数
     */
    int insert(News news);

    /**
     * 通过title删除
     * @param title
     * @param id
     * @return
     */
    int deleteByTitle(@Param("title") String title,@Param("id") String id);

    /**
     * 修改
     * @param title
     * @param id
     * @return
     */
    int reviseByTitle(@Param("title") String title,@Param("id") String id);
}
