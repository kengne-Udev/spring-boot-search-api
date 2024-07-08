package com.hotelapi.hotel.models;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
    //private Long id;
    private String name;
    private String address;
    private float pricePerNight;
    private boolean availability;

    public Hotel(){

    }

    public Hotel(String name, String address, float pricePerNight, boolean availability){
        //this.id = id;
        this.name = name;
        this.address = address;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
    }

    // public Long getId(){
    //     return id;
    // }

    // public void setId(Long id){
    //     this.id = id;
    // }

    @JsonProperty("name")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @JsonProperty("address")
    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @JsonProperty("pricePerNight")
    public double getPricePerNight(){
        return pricePerNight;
    }

    
    public void setPricePerNight(float pricePerNight){
        this.pricePerNight = pricePerNight;
    }

    @JsonProperty("availability")
    public boolean getAvailability(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }

}
