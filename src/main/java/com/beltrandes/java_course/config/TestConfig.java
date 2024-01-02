package com.beltrandes.java_course.config;

import com.beltrandes.java_course.entities.Order;
import com.beltrandes.java_course.entities.User;
import com.beltrandes.java_course.repositories.UserRepository;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
