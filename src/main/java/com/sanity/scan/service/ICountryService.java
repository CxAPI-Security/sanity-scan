package com.sanity.scan.service;

import com.sanity.scan.model.Country;
import com.sanity.scan.model.GovernmentForm;


public interface ICountryService {
    Country getCountryById(int id);

    GovernmentForm getGovernmentForms(int id);
}
