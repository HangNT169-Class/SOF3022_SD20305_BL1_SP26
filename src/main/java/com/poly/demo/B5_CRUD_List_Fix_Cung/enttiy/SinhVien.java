package com.poly.demo.B5_CRUD_List_Fix_Cung.enttiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
public class SinhVien {
//    Tạo đối tượng SinhVien gồm các thuộc tính:
//    mssv - String, ten-String,
//    tuoi- int, diaChi - String,
//    gioiTinh - boolean và các constructor, getter, setter

    private String mssv;

    private String ten;

    private int tuoi;

    private String diaChi;

    private boolean gioiTinh;

//    public SinhVien() {
//    }

    public SinhVien(String mssv, String ten, int tuoi, String diaChi, boolean gioiTinh) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
