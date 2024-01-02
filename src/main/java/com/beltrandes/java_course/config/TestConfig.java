package com.beltrandes.java_course.config;

import com.beltrandes.java_course.entities.Category;
import com.beltrandes.java_course.entities.Order;
import com.beltrandes.java_course.entities.User;
import com.beltrandes.java_course.entities.enums.OrderStatus;
import com.beltrandes.java_course.repositories.CategoryRepository;
import com.beltrandes.java_course.repositories.OrderRepository;
import com.beltrandes.java_course.repositories.UserRepository;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        var u1 = new User(null, "Maria Brown", "maria@gmail.com", "11999999999", "12345");
        var u2 = new User(null, "Alex Green", "alex@gmail.com", "11988888888", "54321");

        var o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        var o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        var o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
