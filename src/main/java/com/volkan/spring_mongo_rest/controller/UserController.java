package com.volkan.spring_mongo_rest.controller;

import com.volkan.spring_mongo_rest.model.User;
import com.volkan.spring_mongo_rest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @PostMapping("/insert")
    public ResponseEntity<User> insert(User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("all")
    public List<User> getAllList(){
        return userRepository.findAll();
    }
}
