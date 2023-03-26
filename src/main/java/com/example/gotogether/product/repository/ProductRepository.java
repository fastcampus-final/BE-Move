package com.example.gotogether.product.repository;

import com.example.gotogether.product.entity.Product;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long productId);

    Page<Product> findAll(Pageable pageable);

    boolean existsByName(String name);

    Page<Product> findAllByNameContainsOrSummaryContainsOrFeatureContainsOrDetailContains(Pageable pageable,String keyword1,String keyword2,String keyword3,String keyword4);

}
