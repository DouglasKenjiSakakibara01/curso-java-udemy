package com.example.projeto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.projeto.entidades.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
