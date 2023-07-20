package com.hotel.service;


import com.hotel.Dao.HotelRepo;
import com.hotel.Exception.HotelNotFoundException;
import com.hotel.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements  HotelService{
    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel create(Hotel hotel) {
      return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
      return hotelRepo.findAll();
    }

    @Override
    public Hotel getById(int hotelId) {
        return  hotelRepo.findById(hotelId).orElseThrow(()->new HotelNotFoundException("hotel not found " + hotelId));
    }
}
