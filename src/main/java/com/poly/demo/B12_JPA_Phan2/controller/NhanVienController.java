package com.poly.demo.B12_JPA_Phan2.controller;

import com.poly.demo.B12_JPA_Phan2.repository.ChucVuRepository;
import com.poly.demo.B12_JPA_Phan2.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NhanVienController {

    @Autowired
    private ChucVuRepository cvRepository;

    @Autowired
    private NhanVienRepository nvRepository;

    @GetMapping("nhan-vien/hien-thi")
    public String hienThiNhanVien(Model m){
        m.addAttribute("listChucVu",cvRepository.findAll());
        m.addAttribute("listNhanVien",nvRepository.findAll());
        return "buoi12/index";
    }

}
