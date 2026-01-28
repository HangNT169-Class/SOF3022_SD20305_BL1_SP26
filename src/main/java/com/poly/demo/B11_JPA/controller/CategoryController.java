package com.poly.demo.B11_JPA.controller;

import com.poly.demo.B11_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository repo;

    @GetMapping
    public String hienThiDanhSachCate(Model m){
        m.addAttribute("lists", repo.findAll());
        return "buoi11";
    }
}
