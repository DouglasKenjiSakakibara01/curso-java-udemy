package com.example.projeto.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projeto.entidades.Order;
public interface OrderRepository extends JpaRepository<Order, Long> {

}