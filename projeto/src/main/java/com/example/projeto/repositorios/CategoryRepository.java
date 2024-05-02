package com.example.projeto.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto.entidades.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}