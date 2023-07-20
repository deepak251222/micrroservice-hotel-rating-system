package com.hotel.controller;


import com.hotel.entity.Hotel;
import com.hotel.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {


    @Autowired
    private HotelServiceImpl hotelService;

    @PostMapping
    public ResponseEntity<?> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1 = hotelService.create(hotel);
       return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<?> createHotel(@PathVariable int hotelId)
    {
       Hotel hotel= hotelService.getById(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel);
    }
    @GetMapping
    public ResponseEntity<?> findAllHotel()
    {
        return ResponseEntity.status(HttpStatus.OK).body( hotelService.getAllHotel());
    }

}
