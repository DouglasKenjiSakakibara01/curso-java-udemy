package com.example.projeto.servicos;

import java.util.*;

import com.example.projeto.entidades.Product;
import com.example.projeto.entidades.User;
import com.example.projeto.repositorios.ProductRepository;
import com.example.projeto.repositorios.UserRepository;
import com.example.projeto.controladores.exceptions.*;
import com.example.projeto.servicos.exceptions.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class ProductService {
    @Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}
    public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.orElseThrow();
	}
}

