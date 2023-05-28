package com.service;

import com.pojo.News;

import java.util.List;

public interface TableNewsService {
    List<News> Table(String user);
    List<News> TableById(String id,String title);
    boolean insertNews(News news);
    boolean deleteByTitle(String id,String title);
}
