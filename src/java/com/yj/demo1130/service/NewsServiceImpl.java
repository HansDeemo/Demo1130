package com.yj.demo1130.service;

import com.yj.demo1130.dao.NewsMapper;
import com.yj.demo1130.util.PageBean;
import com.yj.demo1130.vo.NewsComment;
import com.yj.demo1130.vo.NewsDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NewsServiceImpl implements NewsService{
    @Resource
    private NewsMapper newsMapper;
    @Override
    public List<NewsDetail> findall(String title, PageBean pageBean) {
        return newsMapper.findall(title,pageBean);
    }

    @Override
    public List<NewsComment> findByid(Integer id) {
        return newsMapper.findByid(id);
    }

    @Override
    public void add(NewsComment newsComment) {
        newsMapper.add(newsComment);

    }

    @Override
    public void deln(Integer id) {
        newsMapper.deln(id);

    }

    @Override
    public void delc(Integer id) {
        newsMapper.delc(id);

    }

    @Override
    public Integer count(String title) {
        return newsMapper.count(title);
    }
}
