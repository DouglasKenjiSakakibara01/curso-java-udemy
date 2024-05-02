package com.example.projeto.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projeto.entidades.OrderItem;
import com.example.projeto.entidades.OrderItemPk;
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPk> {

}
