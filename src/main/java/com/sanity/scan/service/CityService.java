package com.sanity.scan.service;

import com.sanity.scan.model.City;
import org.springframework.stereotype.Service;


@Service
public class CityService implements ICityService {
    @Override
    public City getCityById(int id) {
        return new City("Tel-Aviv", "I'm the mayor", 18);
    }

}
