package com.yj.demo1130.controller;

import com.yj.demo1130.service.NewsServiceImpl;
import com.yj.demo1130.util.PageBean;
import com.yj.demo1130.vo.NewsComment;
import com.yj.demo1130.vo.NewsDetail;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Resource
    private NewsServiceImpl newsService;
    @RequestMapping("list.do")
    public String getlist(String title, String pageNo, Model model){
        int pageNoint=1;
        if(pageNo!=null){
            pageNoint=Integer.parseInt(pageNo);
        }
        int count = newsService.count(title);
        PageBean pageBean = new PageBean(pageNoint,2,count);
        List<NewsDetail> list=newsService.findall(title,pageBean);
        model.addAttribute("list",list);
        model.addAttribute("title",title);
        model.addAttribute("pageBean",pageBean);
        return "list";
    }
    @RequestMapping("comments.do")
    public String getcc(Integer id,Model model){
        List<NewsComment> list=newsService.findByid(id);
        model.addAttribute("list",list);
        return "comment";
    }
    @RequestMapping("cc.do")
    public String cc(Integer id,Model model){
        model.addAttribute("id",id);
        return "Set";
    }
    @RequestMapping("add.do")
    public String addcc(Integer newsid,String content,String author,Model model){
        NewsComment newsComment1=new NewsComment();
        newsComment1.setAuthor(author);
        newsComment1.setCreatedate(new Date());

        newsComment1.setNewsid(newsid);
        newsComment1.setContent(content);
        newsService.add(newsComment1);
        List<NewsComment> list=newsService.findByid(newsid);
        model.addAttribute("list",list);
        return "comment";
    }
    @RequestMapping("del.do")
    public String del(Integer id,String title, String pageNo, Model model){
        newsService.delc(id);
        newsService.deln(id);
        int pageNoint=1;
        if(pageNo!=null){
            pageNoint=Integer.parseInt(pageNo);
        }
        int count = newsService.count(title);
        PageBean pageBean = new PageBean(pageNoint,2,count);
        List<NewsDetail> list=newsService.findall(title,pageBean);
        model.addAttribute("list",list);
        model.addAttribute("title",title);
        model.addAttribute("pageBean",pageBean);
        return "list";

    }

}
