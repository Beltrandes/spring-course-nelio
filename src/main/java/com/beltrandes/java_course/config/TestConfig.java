package com.beltrandes.java_course.config;

import com.beltrandes.java_course.entities.User;
import com.beltrandes.java_course.repositories.UserRepository;
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
        var u1 = new User(null, "Maria Brown", "maria@gmail.com", "11999999999", "12345");
        var u2 = new User(null, "Alex Green", "alex@gmail.com", "11988888888", "54321");

        userRepository.save(u1);
        userRepository.save(u2);
    }
}
