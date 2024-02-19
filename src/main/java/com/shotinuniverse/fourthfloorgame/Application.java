package com.shotinuniverse.fourthfloorgame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

    @Autowired
    UserRepository userItemRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
