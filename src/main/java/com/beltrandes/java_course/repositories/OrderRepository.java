package com.beltrandes.java_course.repositories;

import com.beltrandes.java_course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
