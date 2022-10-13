package com.sanity.scan.service;

import com.sanity.scan.model.Country;
import com.sanity.scan.model.GovernmentForm;
import org.springframework.stereotype.Service;


@Service
public class CountryService implements ICountryService {
    @Override
    public Country getCountryById(int id) {
        return new Country(id, "", "", "", "", "",
                GovernmentForm.getById(id), "");
    }

    @Override
    public GovernmentForm getGovernmentForms(int id) {
        return GovernmentForm.getById(id);
    }
}
