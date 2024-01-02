package com.beltrandes.java_course.repositories;

import com.beltrandes.java_course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
