package com.sanity.scan.controller;

import com.sanity.scan.model.Country;
import com.sanity.scan.model.GovernmentForm;
import com.sanity.scan.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    private ICountryService countryService;

    @GetMapping(value = "/country/get/byId/{id}")
    public Country getCountryById(@PathVariable("id") int id) {
        System.out.println("getCountryById");
        System.out.println(id);
        return countryService.getCountryById(id);
    }

    @GetMapping(value = "/country/get/governmentForm/{id}")
    public GovernmentForm getGovernmentFormById(@PathVariable("id") int id) {
        return countryService.getGovernmentForms(id);
    }
}
