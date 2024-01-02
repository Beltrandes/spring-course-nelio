package com.beltrandes.java_course.repositories;

import com.beltrandes.java_course.entities.Category;
import com.beltrandes.java_course.entities.OrderItem;
import com.beltrandes.java_course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
