package com.spring.service.impl;

import com.spring.dao.UserRepo;
import com.spring.entitys.User;
import com.spring.exception.GloableHandlingException;
import com.spring.payload.Hotel;
import com.spring.payload.Rating;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
   private RestTemplate restTemplate;
    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
    @Override
    public List<User> getAllUser() {
        List<User> user=userRepo.findAll();
        return user;
    }
    @Override
    public User getUser(int userId) {
        User user =userRepo.findById(userId).orElseThrow(() -> new GloableHandlingException("User Not Found Exception" +userId));
         // http://localhost:8083/api/rating/user/1
        //calling rating url
   Rating [] ratingOfUser =  restTemplate.getForObject("http://RATING-SERVICE/api/rating/user/"+user.getUserId(), Rating [].class);

        List<Rating> ratingList=Arrays.stream(ratingOfUser).toList();
       /// calling hotel service

       List<Rating> ratingList1 =ratingList.stream().map(rating-> {
            //http://localhost:8082/api/hotel/1
           ResponseEntity<Hotel>  forEntity= restTemplate.getForEntity("http://HOTEL-SERVICE/api/hotel/"+rating.getHotelId(), Hotel.class);
             Hotel hotel= forEntity.getBody();
            rating.setHotel(hotel);
             return rating;
        }).collect(Collectors.toList());
       user.setRating(ratingList1);
        return user;
    }
}
