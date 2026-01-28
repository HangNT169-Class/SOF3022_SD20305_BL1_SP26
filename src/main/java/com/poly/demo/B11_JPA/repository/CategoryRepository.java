package com.poly.demo.B11_JPA.repository;

import com.poly.demo.B11_JPA.entity.Category1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category1,Long > {
    // ths 1: Doi tuong (class trong entity) => muon CRUD
    // ths 2: Kieu du lieu cua khoa chinh
    // CRUD k can phai viet (co san ham CRUD)
    // R: Read: findAll()
    // Add hoac update: save(doi tuong)
    // Delete: deleteById(khoa chinh)
    // detail: findById(khoa chinh)

//    List<Category1>findAllByCategoryCodeOrCategoryNameOrderById(String categoryCode, String categoryName);
    //JPQL <=> HQL => truy van trn thuc the

    @Query("SELECT c FROM Category1 c WHERE c.categoryName = ?1")
    List<Category1>timKiem(String name);

    // Native query
}
