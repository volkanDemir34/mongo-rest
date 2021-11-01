package com.volkan.spring_mongo_rest.repository;

import com.volkan.spring_mongo_rest.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
