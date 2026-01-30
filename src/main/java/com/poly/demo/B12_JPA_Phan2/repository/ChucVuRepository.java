package com.poly.demo.B12_JPA_Phan2.repository;

import com.poly.demo.B12_JPA_Phan2.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu,Integer> {
}
