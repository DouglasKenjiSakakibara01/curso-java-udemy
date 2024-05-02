package com.example.projeto.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projeto.entidades.User;
public interface UserRepository extends JpaRepository<User, Long> {

}