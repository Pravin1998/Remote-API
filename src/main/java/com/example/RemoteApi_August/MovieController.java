package com.example.RemoteApi_August;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("get-info")
    public Object getMoviesinforma(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=c17971a0c390bdf3464585d7f2626a12";
        Object response = restTemplate.getForObject(url,Object.class);
        return response;
    }
    @GetMapping("/get-info-customized")
    public MovieResponse getMovieInfo(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=c17971a0c390bdf3464585d7f2626a12";
        MovieResponse response = restTemplate.getForObject(url,MovieResponse.class);
        return response;
    }
}
