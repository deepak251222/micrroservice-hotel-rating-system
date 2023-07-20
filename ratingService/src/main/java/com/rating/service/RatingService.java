package com.rating.service;

import com.rating.entity.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRating();

    List<Rating> getRatingByUserId(int userId);

    List<Rating> getRatingByHotelId(int hotelId);
}
