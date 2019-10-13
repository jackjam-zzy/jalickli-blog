package com.jalickli.ufoblog.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jalickli.ufoblog.Service.QuestionService;
import com.jalickli.ufoblog.dto.QuestionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String hello(Model model,
                        @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum,3);
        List<QuestionDTO> questionList = questionService.list();
        PageInfo<QuestionDTO> pageInfo = new PageInfo<>(questionList);
        model.addAttribute("questions", questionList);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
