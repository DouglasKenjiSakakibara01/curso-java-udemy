package com.example.projeto.entidades;

import java.io.Serializable;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class OrderItemPk implements Serializable
{
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    
    public Order getOrder(){
        return this.order;
    }

    public void setOrder(Order order){
        this.order=order;
    }

    public Product getProduct(){
        return this.product;

    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
