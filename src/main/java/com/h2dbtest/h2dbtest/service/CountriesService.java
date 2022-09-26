package com.h2dbtest.h2dbtest.service;

import com.h2dbtest.h2dbtest.model.Countries;
import com.h2dbtest.h2dbtest.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {

    @Autowired
    CountriesRepository countriesRepository;

    public Countries saveCountry(String name){
        return countriesRepository.save(
            new Countries(
                name
            )
        );
    }
}
