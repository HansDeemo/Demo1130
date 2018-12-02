package com.yj.demo1130.dao;

import com.yj.demo1130.util.PageBean;
import com.yj.demo1130.vo.NewsComment;
import com.yj.demo1130.vo.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    //模糊查询分页
    public List<NewsDetail> findall(@Param("title")String title, @Param("pageBean")PageBean pageBean);
    //查看评论
    public List<NewsComment> findByid(@Param("id")Integer id);
    //增加评论
    public void add(@Param("newsComment")NewsComment newsComment);
    //删除新闻
    public void deln(@Param("id")Integer id);
    //删除评论
    public void delc(@Param("id")Integer id);
    //count
    public Integer count(@Param("title")String title);


}
