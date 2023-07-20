package com.rating.controller;

import com.rating.entity.Rating;
import com.rating.service.RatingServieceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/rating")
public class RatingController {
    @Autowired
    private RatingServieceImpl ratingService;
    @PostMapping
    public ResponseEntity<?> createRating(@RequestBody Rating rating)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }
    @GetMapping
    public ResponseEntity<List<Rating>> createRating()
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.getAllRating());
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.getRatingByUserId(userId));
    }
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotel(@PathVariable int hotelId)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService. getRatingByHotelId(hotelId));
    }
}
