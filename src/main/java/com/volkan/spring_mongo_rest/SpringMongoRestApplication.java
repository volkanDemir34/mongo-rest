package com.volkan.spring_mongo_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class    SpringMongoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoRestApplication.class, args);
    }

}
