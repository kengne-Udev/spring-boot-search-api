package com.hotelapi.hotel.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class HotelService {
    private static final String apiUrl = "https://agoda-com.p.rapidapi.com/hotels/search-day-use";
    
    @Autowired
    private RestTemplate restTemplate;


    public Object getAllHotels(String checkinDate, String checkoutDate, String time, String id) throws JsonMappingException, JsonProcessingException {
        // System.out.println(checkinDate);

        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-key", "58c9ef9958msh7aef8a095ad8933p1fd4d7jsndff42b4f05d6");
        headers.set("x-rapidapi-host", "agoda-com.p.rapidapi.com");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(apiUrl);
        
        builder.queryParam("checkinDate", "2024-07-08");
        builder.queryParam("ckeckoutDate", "2024-07-09");
        builder.queryParam("id", "1_15612");
        builder.queryParam("time", "17:16");

        String url = builder.toUriString();

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        return root;
    }

    
}
