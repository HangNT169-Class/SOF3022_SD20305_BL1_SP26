package com.poly.demo.B12_JPA_Phan2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @Column(name = "Ma", length = 20)
    private String ma;

    @Size(max = 30)
    @Nationalized
    @Column(name = "Ten", length = 30)
    private String ten;

    @Size(max = 30)
    @Nationalized
    @Column(name = "TenDem", length = 30)
    private String tenDem;

    @Size(max = 30)
    @Nationalized
    @Column(name = "Ho", length = 30)
    private String ho;

    @Size(max = 10)
    @Nationalized
    @Column(name = "GioiTinh", length = 10)
    private String gioiTinh;

    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Size(max = 100)
    @Nationalized
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Size(max = 30)
    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Lob
    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne
    @JoinColumn(name = "IdCV")
    private ChucVu idCV;

    @Column(name = "TrangThai")
    private Integer trangThai;

}