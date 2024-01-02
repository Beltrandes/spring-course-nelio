package com.beltrandes.java_course.repositories;

import com.beltrandes.java_course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
