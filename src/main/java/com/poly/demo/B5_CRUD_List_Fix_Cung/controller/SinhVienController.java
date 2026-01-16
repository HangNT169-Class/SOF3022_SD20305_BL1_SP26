package com.poly.demo.B5_CRUD_List_Fix_Cung.controller;

import com.poly.demo.B5_CRUD_List_Fix_Cung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {

    // goi => service
    // Bean => co bn cach goi bean // Slide 5
    @Autowired
    private SinhVienService service;

//    @Autowired
//    private ThucVatService tvSerivce;


    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model m){
        m.addAttribute("lists",service.getLists());
        return "buoi4/sinh-viens";
    }
}
