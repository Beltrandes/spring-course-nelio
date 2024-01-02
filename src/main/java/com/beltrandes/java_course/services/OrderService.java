package com.beltrandes.java_course.services;

import com.beltrandes.java_course.entities.Order;
import com.beltrandes.java_course.entities.User;
import com.beltrandes.java_course.repositories.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);

        return obj.get();
    }
}
