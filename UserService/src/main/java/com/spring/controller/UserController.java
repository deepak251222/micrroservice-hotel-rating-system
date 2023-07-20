package com.spring.controller;


import com.spring.entitys.User;
import com.spring.service.impl.UserServiceImpl;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;


@RequestMapping("/api/user")
@RestController
public class UserController {


    @Autowired
    private UserServiceImpl userService;

  @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        User user1=userService.saveUser(user);
        return   ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{userId}")
      @CircuitBreaker(name="ratinghotelservice",fallbackMethod = "ratinghotelfailure")
    public ResponseEntity<?> getByid(@PathVariable int userId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUser(userId));
    }
    public ResponseEntity<?> ratinghotelfailure(int userId,Exception ex)
    {
        return ResponseEntity.status(HttpStatus.OK).body("Rating or Hotel Service Getting Some error @!");
    }

    @GetMapping
    public ResponseEntity<?> getAll()
    {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUser());
    }

}
