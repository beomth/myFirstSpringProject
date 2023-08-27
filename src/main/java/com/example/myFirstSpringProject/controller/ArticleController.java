package com.example.myFirstSpringProject.controller;

import com.example.myFirstSpringProject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticles(ArticleForm form) {
        System.out.println(form.toString());
        //1. DTO를 엔티티로 변환
        //2. Repository로 Entity를 DB에 저장
        return "";
    }
}
