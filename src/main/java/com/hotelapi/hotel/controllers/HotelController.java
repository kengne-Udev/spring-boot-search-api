package com.hotelapi.hotel.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.hotelapi.hotel.servicies.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping(path = "hotels")
    public ResponseEntity<?> getHotels(@RequestParam(required = false) String checkinDate,
                                        @RequestParam(required = false) String checkoutDate,
                                        @RequestParam(required = false) String time,
                                        @RequestParam(required = false) String id
    ) throws JsonMappingException, JsonProcessingException {
          System.out.println(checkinDate);
        return ResponseEntity.ok(hotelService.getAllHotels(checkinDate, checkoutDate, time, id));
    }
    
}
