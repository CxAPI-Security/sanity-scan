package com.sanity.scan.controller;

import com.sanity.scan.model.City;
import com.sanity.scan.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping(value = "/city/get/byId/{id}")
    public City getCityById(@PathVariable("id") int id) {
        System.out.println("getCityById");
        System.out.println(id);
        return cityService.getCityById(id);
    }

}
