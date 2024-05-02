package com.example.projeto.servicos;
import java.util.*;

import com.example.projeto.entidades.User;
import com.example.projeto.repositorios.UserRepository;
import com.example.projeto.controladores.exceptions.*;
import com.example.projeto.servicos.exceptions.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

@Service
public class OrderService {
    @Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}
    public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow();
	}
}

