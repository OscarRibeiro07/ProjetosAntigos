package com.security.test.springbootsecurity.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.test.springbootsecurity.produto.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
