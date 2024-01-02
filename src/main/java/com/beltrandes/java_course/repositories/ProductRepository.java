package com.beltrandes.java_course.repositories;

import com.beltrandes.java_course.entities.Category;
import com.beltrandes.java_course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
