package com.poly.demo.B12_JPA_Phan2.repository;

import com.poly.demo.B12_JPA_Phan2.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,Integer> {
}
